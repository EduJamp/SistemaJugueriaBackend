package com.app.changui.domain.mapper;

import com.app.changui.domain.dto.ProductDTO;
import com.app.changui.persistence.entity.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper( componentModel = "spring" )
public interface ProductMapper {
//    Convertir a ProductDTO
    @Mappings({
            @Mapping( source = "image", target = "imgProduct" ),
            @Mapping( source = "name", target = "nameProduct" ),
            @Mapping( source = "price", target = "priceProduct" ),
            @Mapping( source = "description", target = "descriptionProduct" ),
            @Mapping( source = "stock", target = "stockProduct" ),
            @Mapping(source = "sede.idSede", target = "idSede"),
            @Mapping(source = "sede.name", target = "nameSede"),
            @Mapping(source = "category.idCategory", target = "idCategory"),
            @Mapping(source = "category.nameCategory", target = "nameCategory")
    })
    ProductDTO toProductDTO(Product product);

//    Convertir a Product ( Entity )
    @InheritInverseConfiguration
    @Mapping(target = "sede", ignore = true) // Ignoramos relaciones complejas en la inversa para evitar errores de creación
    @Mapping(target = "category", ignore = true)
    Product toProduct(ProductDTO productDTO);
}
