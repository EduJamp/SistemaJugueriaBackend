package com.app.changui.domain.mapper;

import com.app.changui.domain.dto.SedeDTO;
import com.app.changui.persistence.entity.Sede;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper( componentModel = "spring", uses = { ProductMapper.class } )
public interface SedeMapper {
//    Convertir Sede a SedeDTO
    @Mappings({
            @Mapping( source = "name", target = "nameSede" ),
            @Mapping( source = "ubicacion", target = "locationSede" ),
            @Mapping( source = "numberPhone", target = "numberPhoneSede" ),
            @Mapping( source = "products", target = "productsSede" )
    })
    SedeDTO toSedeDTO(Sede sede);

//    Convertir SedeDTO a Sede ( Entity )
    @InheritInverseConfiguration
//    Le decimos a MapStruct que ignore las listas que no viajan en el DTO
    @Mapping(target = "employees", ignore = true)
    @Mapping(target = "orders", ignore = true)
    Sede toSede(SedeDTO sedeDTO);
}
