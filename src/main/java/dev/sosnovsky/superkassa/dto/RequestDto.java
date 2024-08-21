package dev.sosnovsky.superkassa.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RequestDto {
    @NotNull(message = "Необходимо указать id")
    private Long id;

    @NotNull(message = "Необходимо указать число")
    private Integer add;
}