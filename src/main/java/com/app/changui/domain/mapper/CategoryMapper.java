package com.app.changui.domain.mapper;

import com.app.changui.domain.dto.CategoryDTO;
import com.app.changui.persistence.entity.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper( componentModel = "spring" )
public interface CategoryMapper {
//    convertir a CategoryDTO
    @Mappings({
            /*
            source = de donde viene | target = a donde va
            solo se usa source y target para cuando los nombres de la clase que viene y la clase a la que se va a mapear no
            coinciden
            * */
            @Mapping( source = "description", target = "descriptionCategory")
    })
    CategoryDTO toCategoryDTO(Category category);

//    convertir a Category (Entidad)
    /*
        Se usa @InheritInverseConfiguration para mapear los datos de manera inversa
    * */
    @InheritInverseConfiguration
    @Mapping( target = "products", ignore = true ) // esto le dice que lo que el espera osea el atributo products no va a llegar
    Category toCategory(CategoryDTO categoryDTO);

    /*
    * El @Mapping( target = atributo, ignore = true )
    * El @Mapping( source = atributo, ignore = true )
    * Le dice a la clase a mapear que tal atributo no va ir ( target ) o que tal atributo no se va a enviar ( source )
    * se puede usar en cualquiera de los 2 mapeos, osea en toCategoryDTO o en toCategory
    * */
}
