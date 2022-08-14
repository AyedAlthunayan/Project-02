package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor @Data
public class ApiResponse {
    private String message;
    private int state;


}
