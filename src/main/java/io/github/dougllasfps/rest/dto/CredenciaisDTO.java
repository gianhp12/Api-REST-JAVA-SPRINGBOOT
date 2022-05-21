package io.github.dougllasfps.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CredenciaisDTO {
    private String login;
    private String senha;
}
