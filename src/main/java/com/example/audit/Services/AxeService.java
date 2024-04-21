package com.example.audit.Services;

import com.example.audit.Repositories.AxeRepository;
import com.example.audit.models.Axe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@AllArgsConstructor
public class AxeService implements IAxeService {

@Autowired
    private AxeRepository axeRepository;

   @Override
   public List<Axe> getAllAxes() {
        return axeRepository.findAll();
    }

    @Override
    public Axe getAxeById(Long id) {
        Optional<Axe> axeOptional = axeRepository.findById(id);
        return axeOptional.orElse(null);
    }

    @Override
    public Axe saveAxe(Axe axe) {
        return axeRepository.save(axe);
    }

    @Override
    public void deleteAxe(Long id) {
        axeRepository.deleteById(id);
    }
}
