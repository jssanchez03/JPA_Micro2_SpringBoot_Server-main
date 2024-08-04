package edu.espe.proyectou1.Dto;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class CompanyDTO {
    private UUID id;
    private String name;
    private String description;
}
