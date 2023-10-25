public class test {

    public static void main(String[] args) {

       adresse adrs1=new adresse();
        adrs1.ville=" sidi bouzid";
       adrs1.couv="bir elhfay";
       adrs1.codpost=9113;
       adrs1.afficheadress();
        adrs1.modifier(1987);
        adrs1.afficheadress();
        adresse adr2=new adresse("gafsa","chabiba",1500);
        adr2.afficheadress();
        adr2.modifier(10100);
        adr2.afficheadress();
        chercheur chr1=new chercheur();
        chr1.nom="ali";
        chr1.poste="ingenieur";
        chercheur chr2=new chercheur("asma","ingenieur++",06);
        chr2.affichchercheur();
        System.out.println("nombre de chercheur "+chr1.nb);
        chr2.comparer(chr1);
        chr2.modifier(5468466);
        chr1.modifier(777777);
        chercheur chr3=new chercheur();
        chr3.ajouter("hounaida","etud",10000);
        chr3.affichchercheur();
        System.out.println("nombre de chercheur "+chr3.nb);
        chercheur ch[]={chr1,chr2,chr3};
        bureau b1=new bureau(111,"bur1",ch);
        bureau b2=new bureau(121,"bur1",ch);
        bureau bt[]={b1,b2};
        laboratoire l=new laboratoire("lab1","spc1",adrs1,bt);
        l.affichelabo();
















    }





}
