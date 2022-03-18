package cloudhumans.proportal.service;


import cloudhumans.proportal.domain.Pro;
import cloudhumans.proportal.dto.ProPostDto;
import cloudhumans.proportal.mapper.ProMapper;
import cloudhumans.proportal.repository.ProRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ProService {

    @Autowired
    private ProRepository proRepository;

    @Transactional
    public Pro save(ProPostDto proPostDto) {
        return proRepository.save(ProMapper.INSTANCE.toEntity(proPostDto));
    }
}
