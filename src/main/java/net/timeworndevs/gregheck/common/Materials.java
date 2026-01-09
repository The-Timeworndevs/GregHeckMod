package net.timeworndevs.gregheck.common;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.timeworndevs.gregheck.Main;

public class Materials {

    //Metals
    public static Material Unobtanium;

    //Clathrates
    public static Material WaterClathrate;
    public static Material ArgonClathrate;

    //Other minerals
    public static Material Clay;

    public static void register() {

        //Metals
        Unobtanium = new Material.Builder(
                Main.id("unobtanium"))
                .ingot()
                .element(Elements.Unobtanium)
                .color(0xb439b4)
                .buildAndRegister();

        //Clathrates
        WaterClathrate = new Material.Builder(
                Main.id("water_clathrate"))
                .gem()
                .ore()
                .formula("(SiO2)6H20")
                .components(GTMaterials.Water, 1, GTMaterials.SiliconDioxide, 6)
                .color(0xb5e8ff)
                .buildAndRegister();

        ArgonClathrate = new Material.Builder(
                Main.id("argon_clathrate"))
                .gem()
                .ore()
                .formula("(SiO2)6Ar")
                .components(GTMaterials.Argon, 1, GTMaterials.SiliconDioxide, 6)
                .color(0x8bc993)
                .buildAndRegister();

        //Other minerals
        Clay = new Material.Builder(
                Main.id("clay"))
                .ore()
                .dust()
                .formula("Na2LiAl2Si(H2O)6")
                .components(GTMaterials.Clay, 1)
                .color(0xadc9de)
                .buildAndRegister();
    }
}
