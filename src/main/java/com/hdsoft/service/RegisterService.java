package com.hdsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hdsoft.entity.Register;
import com.hdsoft.repo.RegisterRepository;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    public Register save(Register register) {
        return registerRepository.save(register);
    }
}
