/*
The MIT License (MIT)

Copyright (c) 2015 Los Andes University

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package co.edu.uniandes.csw.libreria.dtos.minimum;

import co.edu.uniandes.csw.libreria.entities.PrizeEntity;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @generated
 */
@XmlRootElement
public class PrizeDTO  implements Serializable{

    private Long id;
    private String nombre;
    private String descripcion;


    /**
     * @generated
     */
    public PrizeDTO() {
    }

    /**
     * Crea un objeto PrizeDTO a partir de un objeto PrizeEntity.
     *
     * @param entity Entidad PrizeEntity desde la cual se va a crear el nuevo objeto.
     * @generated
     */
    public PrizeDTO(PrizeEntity entity) {
	   if (entity!=null){
        this.id=entity.getId();
        this.nombre=entity.getNombre();
        this.descripcion=entity.getDescripcion();
       }
    }

    /**
     * Convierte un objeto PrizeDTO a PrizeEntity.
     *
     * @return Nueva objeto PrizeEntity.
     * @generated
     */
    public PrizeEntity toEntity() {
        PrizeEntity entity = new PrizeEntity();
        entity.setId(this.getId());
        entity.setNombre(this.getNombre());
        entity.setDescripcion(this.getDescripcion());
    return entity;
    }

    /**
     * Obtiene el atributo id.
     *
     * @return atributo id.
     * @generated
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el valor del atributo id.
     *
     * @param id nuevo valor del atributo
     * @generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el atributo nombre.
     *
     * @return atributo nombre.
     * @generated
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el valor del atributo nombre.
     *
     * @param nombre nuevo valor del atributo
     * @generated
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el atributo descripcion.
     *
     * @return atributo descripcion.
     * @generated
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece el valor del atributo descripcion.
     *
     * @param descripcion nuevo valor del atributo
     * @generated
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
