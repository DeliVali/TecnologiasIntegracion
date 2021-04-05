//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.03 a las 06:07:18 PM CST 
//


package org.example.alumnos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="materia1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="materia2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="materia3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="promedio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "materia1",
    "materia2",
    "materia3",
    "promedio"
})
@XmlRootElement(name = "AlumnoResponse")
public class AlumnoResponse {

    protected double materia1;
    protected double materia2;
    protected double materia3;
    protected double promedio;

    /**
     * Obtiene el valor de la propiedad materia1.
     * 
     */
    public double getMateria1() {
        return materia1;
    }

    /**
     * Define el valor de la propiedad materia1.
     * 
     */
    public void setMateria1(double value) {
        this.materia1 = value;
    }

    /**
     * Obtiene el valor de la propiedad materia2.
     * 
     */
    public double getMateria2() {
        return materia2;
    }

    /**
     * Define el valor de la propiedad materia2.
     * 
     */
    public void setMateria2(double value) {
        this.materia2 = value;
    }

    /**
     * Obtiene el valor de la propiedad materia3.
     * 
     */
    public double getMateria3() {
        return materia3;
    }

    /**
     * Define el valor de la propiedad materia3.
     * 
     */
    public void setMateria3(double value) {
        this.materia3 = value;
    }

    /**
     * Obtiene el valor de la propiedad promedio.
     * 
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * Define el valor de la propiedad promedio.
     * 
     */
    public void setPromedio(double value) {
        this.promedio = value;
    }

}
