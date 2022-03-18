package cloudhumans.proportal.mapper;


import cloudhumans.proportal.domain.Pro;
import cloudhumans.proportal.dto.ProPostDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public interface ProMapper extends AbstractMapper<Pro, ProPostDto>{

    ProMapper INSTANCE = Mappers.getMapper(ProMapper.class);
    
}
