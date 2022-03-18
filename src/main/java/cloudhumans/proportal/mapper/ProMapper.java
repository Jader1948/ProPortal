package cloudhumans.proportal.mapper;


import cloudhumans.proportal.domain.Pro;
import cloudhumans.proportal.dto.ProPostDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProMapper {

    ProMapper INSTANCE = Mappers.getMapper(ProMapper.class);

    Pro toPro(ProPostDto proPostDto);
}
