package practice;

public class Environment {
    public static void main(String[] args) {
        int x = 4; // {(x,4)}
        int y = 5; // {(x,4), (y,5)} = r
        y = y + x;
        // {y+x}r
        // {5 + x}r
        // {5+4}r
        // 9r
        // {y = 9}r
        // {}{(x,4),(y,9)}
        // r' = {(x,4),(y,9)}
        // closure : 코드를 해석하는 문맥의 쌍
        // reduction : closure를 가지고 최대한 줄이는 것
        {
            int z = 3; // {(z,3)} + r' = environment
            int y = 4; // r'' = {(z,3),(y,4)} + r' - frame
            y = x; // .... {y=4}r'' -> {}{(z,3),(y,4)} + r'
        }
    }
}
