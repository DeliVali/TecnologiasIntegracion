
package com.example.actividad5;

import org.example.alumnos.AlumnoRequest;
import org.example.alumnos.AlumnoResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AlumnosEndPoint{

    @PayloadRoot (namespace = "http://www.example.org/alumnos",localPart = "AlumnoRequest")
    @ResponsePayload

    public AlumnoResponse calificaciones(@RequestPayload AlumnoRequest peticion){
        AlumnoResponse respuesta =new AlumnoResponse();
        // Creacion de Array de alumnos
         String [] alumno1={"Zs18014756","contraseña"};
         String [] alumno2={"Zs1904575","123456789"};
         String [] alumno3={"Zs1701267","password"};
            int aux;
           if(peticion.getMatricula().equals(alumno1[0])&& peticion.getContraseña().equals(alumno1[1])){
               aux=1;
           }else{
            if(peticion.getMatricula().equals(alumno2[0])&& peticion.getContraseña().equals(alumno2[1])){
                aux=2;
            }else{
                if(peticion.getMatricula().equals(alumno3[0])&& peticion.getContraseña().equals(alumno3[1])){
                    aux=3;
                }else{
                    aux=0;
                }
            }
           }
        //Creacion de switch para identificar alumnos
        switch(aux){
            case 1:
                respuesta.setMateria1(9.0);
                respuesta.setMateria2(8.5);
                respuesta.setMateria3(7.4);
                respuesta.setPromedio(
                    (respuesta.getMateria1()+
                    respuesta.getMateria2()+
                    respuesta.getMateria3()
                )/3);
            break;
            case 2:
            respuesta.setMateria1(7.5);
            respuesta.setMateria2(6.5);
            respuesta.setMateria3(5);
            respuesta.setPromedio(
                (respuesta.getMateria1()+
                respuesta.getMateria2()+
                respuesta.getMateria3()
            )/3);
        break;
        case 3:
        respuesta.setMateria1(10);
        respuesta.setMateria2(9.8);
        respuesta.setMateria3(9);
        respuesta.setPromedio(
            (respuesta.getMateria1()+
            respuesta.getMateria2()+
            respuesta.getMateria3()
        )/3);
    break;
    case 0:
    respuesta.setMateria1(0);
    respuesta.setMateria2(0);
    respuesta.setMateria3(0);
    respuesta.setPromedio(
        (respuesta.getMateria1()+
        respuesta.getMateria2()+
        respuesta.getMateria3()
    )/3);
break;

        }


        return respuesta;
    } 



}