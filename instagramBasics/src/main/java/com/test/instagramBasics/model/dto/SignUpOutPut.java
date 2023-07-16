package com.test.instagramBasics.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SignUpOutPut {
    private Boolean signUpStatus;
    private String signUpMessage;
}
