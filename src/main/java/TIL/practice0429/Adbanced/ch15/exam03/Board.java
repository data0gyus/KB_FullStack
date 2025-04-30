package TIL.practice0429.Adbanced.ch15.exam03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    private String subject;
    private String content;
    private String writer;
}
