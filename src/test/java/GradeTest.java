import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GradeTest {
    Grade grade = new Grade();
    @Test
    void test1() {
        assertEquals("Phương trình vô nghiệm", grade.giaiPTBac2(0, 0, 2));
    }
    @Test
    void test2() {
        assertEquals("Phương trình có 2 nghiệm", grade.giaiPTBac2(1, 3, 1));
    }
    @Test
    void test4() {
        assertEquals("Phương trình có nghiệm kép", grade.giaiPTBac2(1, 2, 1));
    }




}