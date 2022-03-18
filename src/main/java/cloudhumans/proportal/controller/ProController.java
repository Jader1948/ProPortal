package cloudhumans.proportal.controller;

import cloudhumans.proportal.domain.Pro;
import cloudhumans.proportal.dto.ProPostDto;
import cloudhumans.proportal.service.ProService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("proportal/pro")
@Log4j2
@RequiredArgsConstructor
public class ProController {

    @Autowired
    private ProService proService;

    // Realiza inserção dos dados do PRO no sistema.
    @PostMapping
    public ResponseEntity<Pro> save(@RequestBody @Valid ProPostDto proPostDto){
        return new ResponseEntity<>(proService.save(proPostDto), HttpStatus.CREATED);
    }

}
