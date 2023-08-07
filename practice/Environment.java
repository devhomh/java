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
        // closure : 코드를 해석하는 문맥의 쌍 ex) (x,4)
        // reduction : closure를 가지고 최대한 줄이는 것
        // evaluate(c,r) = (c',r') - 코드에서 실행시킨 결과를 evaluate해서 보여주는 프로그램을 Interpreter라고 한다.
        {
            int z = 3; // {(z,3)} + r' = environment (binding된 값들의 집합)
            int y = 4; // r'' = {(z,3),(y,4)} + r' - frame
            y = x; // .... {y=4}r'' -> {}{(z,3),(y,4)} + r'
        }
    }
}
