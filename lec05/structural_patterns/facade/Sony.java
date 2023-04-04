package lecture.lec05.structural_patterns.facade;

public class Sony implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println(" Sony Xperia 20 ");

    }

    @Override
    public void price() {
        System.out.println(" 2000$ ");

    }

}
