package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        Voiture vo = new Voiture("Tesla", 90);
        String marque = "Tesla";
        int prx = 90;
        Assert.isTrue(marque == vo.getMarque(), "Pas la bonne marque");
        Assert.isTrue(prx == 90, "Pas le bon prix");
    }

    @Test
    void estVide(){
        Voiture vo = new Voiture();
        String marque = null;
        Assert.isTrue(vo.getMarque() == marque, "a une marque");
        Assert.isTrue(vo.getPrix() == 0, "a un prix");
        /*v1.getMarque().equals(v2.getMarque());*/
    }

}
