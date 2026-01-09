package net.timeworndevs.gregheck.common;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import net.timeworndevs.gregheck.Main;

public class Materials {

    //Metals
    public static Material UNOBTANIUM;

    //Clathrates
    public static Material WATER_CLATHRATE;
    public static Material ARGON_CLATHRATE;

    //Other minerals
    public static Material KAOLINITE;

    public static void register() {

        //Metals
        UNOBTANIUM = new Material.Builder(
                Main.id("unobtanium"))
                .ingot()
                .ore()
                .element(Elements.UNOBTAINIUM)
                .color(0xb439b4)
                .buildAndRegister();

        //Clathrates
        WATER_CLATHRATE = new Material.Builder(
                Main.id("water_clathrate"))
                .gem()
                .ore()
                .color(0xb5e8ff)
                .buildAndRegister();

        ARGON_CLATHRATE = new Material.Builder(
                Main.id("argon_clathrate"))
                .gem()
                .ore()
                .color(0x8bc993)
                .buildAndRegister();

        //Other minerals
        KAOLINITE = new Material.Builder(
                Main.id("kaolinite"))
                .dust()
                .ore()
                .color(0xbacdd1)
                .buildAndRegister();
    }
}
