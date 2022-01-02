import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // Değişkenleri tanımla
        String userName, password,answer;

        //Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        // Kullanıcı adı ve şifreyi al
        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = inp.nextLine();
        System.out.print("Şİfrenizi giriniz : ");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız");
        }else{
            System.out.println("Girilen bilgiler yanlış. Şifrenizi değiştirmek ister misiniz ?(evet/hayır)");
            answer = inp.nextLine();

            if(answer.equals("evet")){
                System.out.print("Lütfen yeni şifrenizi giriniz :" );
                String newPassword = inp.nextLine();
                if(newPassword.equals(password)){
                    System.out.println("Yeni şifreniz eskisi ile aynı olamaz lütfen farklı bir şifre belirleyin.");
                }else{
                    password = newPassword;
                    System.out.println("Yeni şifre kabul edildi.");
                }
            }
            
        }
        


        
    }
}