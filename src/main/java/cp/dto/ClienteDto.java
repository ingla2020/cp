package cp.dto;


import lombok.Data;

@Data
public class ClienteDto {
    private Integer userId;
    private Integer id;
    private String title;
    private String body;
}
