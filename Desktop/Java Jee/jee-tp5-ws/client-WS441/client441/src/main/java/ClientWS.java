import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWs().getBanqueServicePort();
        System.out.println(stub.convert(8900));
        Compte sb = stub.getCompte(2);
        System.out.println(sb.getCode());
        System.out.println(sb.getSolde());
    }
}
