var mensaje
function ini(){
    mensaje = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
    '<Body>' +
    '<AlumnoRequest xmlns="http://www.example.org/alumnos">' +
    '<matricula>'+document.getElementById('matricula').value+'</matricula>' +
    '<contraseña>'+document.getElementById('contraseña').value+'</contraseña>' +
    '</AlumnoRequest>' +
    '</Body>' +
    '</Envelope>';
}




function soap() {
    // alert('hola')
    ini()
    axios.post('http://ec2-34-228-56-203.compute-1.amazonaws.com:8080//ws/calculadora/', mensaje,{
        headers:{
            'Content-Type' : 'text/xml'
        }
    })
    .then(function (response){
        if(resultado1(response.data)==0 && resultado2(response.data)==0 && resultado3(response.data)==0 
        && resultado4(response.data)==0
        ){
            alert('Ingrese un alumno valido')
            document.getElementById('materia1').value=""
            document.getElementById('materia2').value=""
            document.getElementById('materia3').value=""
            document.getElementById('promedio').value=""
        } 
        
        else{
            document.getElementById('materia1').value=resultado1(response.data)
document.getElementById('materia2').value=resultado2(response.data)
document.getElementById('materia3').value=resultado3(response.data)
document.getElementById('promedio').value=resultado4(response.data)
        }

    })
    .catch(err => console.log(err));
}

function resultado1(rXml){
    var parser = new DOMParser();
    var xmlDoc = parser.parseFromString(rXml,"text/xml");
    var mat1 = xmlDoc.getElementsByTagName("ns2:materia1")[0].childNodes[0].nodeValue;
    return mat1;
}
function resultado2(rXml){
    var parser = new DOMParser();
    var xmlDoc = parser.parseFromString(rXml,"text/xml");
    var mat2 = xmlDoc.getElementsByTagName("ns2:materia2")[0].childNodes[0].nodeValue;
    return mat2;
}
function resultado3(rXml){
    var parser = new DOMParser();
    var xmlDoc = parser.parseFromString(rXml,"text/xml");
    var mat3 = xmlDoc.getElementsByTagName("ns2:materia3")[0].childNodes[0].nodeValue;
    return mat3;
}
function resultado4(rXml){
    var parser = new DOMParser();
    var xmlDoc = parser.parseFromString(rXml,"text/xml");
    var mat3 = xmlDoc.getElementsByTagName("ns2:promedio")[0].childNodes[0].nodeValue;
    return mat3;
}