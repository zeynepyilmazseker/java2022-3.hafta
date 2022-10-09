public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers=new BaseKrediManager[]{new TarimKrediManager(),new OgretmenKrediManager(),new OgrenciKrediManager()};
  for(BaseKrediManager krediManager: krediManagers){
      System.out.println("kredi tutarı:" + krediManager.hesapla(5000));
  }
    }
}