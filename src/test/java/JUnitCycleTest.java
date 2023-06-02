import org.junit.jupiter.api.*;

public class JUnitCycleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll");
    }
    // 전체 테스트를 시작하기 전에 처음으로 한 번만 실행
    // 데이터베이스를 연결하거나 테스트 환경을 초기화
    // static으로 선언해야 함 -> 전체 테스트 실행 주기에서 한 번만 호출되기 때문에

    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }
    // 테스트 케이스를 시작하기 전에 실행
    // 테스트메서드에서 사용하는 객체를 초기화하거나 테스트에 필요한 값을 미리 넣어보는 용도
    // static이 아니어야 함 -> 인스턴스에 대한 메서드를 호출해야 하기 때문에

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll");
    }
    // 전체테스트를 마치고 종료하기 전에 한 번만 실행
    // 데이터 베이스 연결을 종료하거나 공통적으로 사용하는 자원을 해제
    // static으로 선언해야 함 -> 전체 테스트 실행 주기에서 한 번만 호출되기 때문에

    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach");
    }
    // 각 테스트를 종료하기 전 매번 실행
    // 테스트 이후에 특정 데이터를 삭제해야 하는 경우 사용
    // static이 아니어야 함 -> 인스턴스에 대한 메서드를 호출해야 하기 때문에

}