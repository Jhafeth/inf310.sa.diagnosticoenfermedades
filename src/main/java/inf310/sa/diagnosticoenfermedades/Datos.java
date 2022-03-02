/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inf310.sa.diagnosticoenfermedades;

import java.util.LinkedList;

/**
 *
 * @author Jhafeth
 */
public class Datos {

    LinkedList<Enfermedad> enfermedades;
    LinkedList<String> nombreEnf;

    private void SintomasInstetinales() {
        LinkedList<String> instestinales = new LinkedList<>();
        LinkedList<String> p = new LinkedList<>();
        instestinales.add("ESCALOFRIOS");
        p.add("¿Usted siente escalofríos?");
        instestinales.add("FATIGA");
        p.add("¿Tiene fatiga?");
        instestinales.add("PERDIDA-PESO");
        p.add("¿Siente que ha perdido peso?");
        instestinales.add("DIARREA");
        p.add("¿Usted tiene diarrea?");
        instestinales.add("SANGRE-HECES");
        p.add("¿Presenta sangre en las heces?");
        instestinales.add("DECOLORACION-AMARILLA-OJOS");
        p.add("¿Presenta decoloración amarilla en los ojos?");
        instestinales.add("DECOLORACION-AMARILLA-PIEL");
        p.add("¿Presenta decoloración amarilla en la piel?");
        instestinales.add("ORINA-AMARILLA-OSCURA");
        p.add("¿Usted orina amarillo oscuro?");
        instestinales.add("NAUSEAS");
        p.add("¿Usted siente náuseas?");
        instestinales.add("VOMITO");
        p.add("¿Presenta vómitos?");
        instestinales.add("DOLOR-ARTICULAR");
        p.add("¿Siente dolor en sus articulaciones?");
        instestinales.add("CALAMBRE-ABDOMINAL");
        p.add("¿Presenta calambres abdominales?");
    }

    private void SintomasGastritis() {
        Enfermedad gastritis = new Enfermedad();
        gastritis.addSintoma("DOLOR-ABDOMINAL", 1);
        gastritis.addSintoma("NAUSEAS", 1);
        gastritis.addSintoma("VOMITO", 1);
        gastritis.addSintoma("LLENURA", 1);
        gastritis.addSintoma("FALTA-APETITO", 4);
        gastritis.addSintoma("PERDIDA-PESO", 4);
        enfermedades.add(gastritis);
        nombreEnf.add("Gastritis");

    }

    private void SintomasSalmonela() {
        Enfermedad salmonela = new Enfermedad();
        salmonela.addSintoma("NAUSEAS", 1);
        salmonela.addSintoma("VOMITO", 1);
        salmonela.addSintoma("CALAMBRE-ABDOMINAL", 4);
        salmonela.addSintoma("DIARREA", 2);
        salmonela.addSintoma("ESCALOFRIOS", 3);
        salmonela.addSintoma("DOLOR-CABEZA", 1);
        salmonela.addSintoma("SANGRE-HECES", 4);
        enfermedades.add(salmonela);
        nombreEnf.add("Salmonela");
    }

    private void SintomasHepatitis() {
        Enfermedad hepatitis = new Enfermedad();
        hepatitis.addSintoma("DIARREA", 3);
        hepatitis.addSintoma("FATIGA", 2);
        hepatitis.addSintoma("DOLOR-ABDOMINAL", 3);
        hepatitis.addSintoma("PERDIDA-PESO", 3);
        hepatitis.addSintoma("FALTA-APETITO", 3);
        hepatitis.addSintoma("SANGRE-HECES", 5);
        enfermedades.add(hepatitis);
        nombreEnf.add("Hepatitis");

    }

    private void SintomasInflamacionIntestinal() {
        Enfermedad inflamacionIntestinal = new Enfermedad();
        inflamacionIntestinal.addSintoma("FIEBRE", 2);
        inflamacionIntestinal.addSintoma("DOLOR-ABDOMINAL", 1);
        inflamacionIntestinal.addSintoma("DECOLORACION-AMARILLA-OJOS", 5);
        inflamacionIntestinal.addSintoma("DECOLORACION-AMARILLA-PIEL", 5);
        inflamacionIntestinal.addSintoma("FALTA-APETITO", 3);
        inflamacionIntestinal.addSintoma("NAUSEAS", 3);
        inflamacionIntestinal.addSintoma("VOMITO", 3);
        inflamacionIntestinal.addSintoma("PICAZON", 2);
        inflamacionIntestinal.addSintoma("ORINA-AMARILLA-OSCURA", 4);
        inflamacionIntestinal.addSintoma("DOLOR-ARTICULAR", 2);
        enfermedades.add(inflamacionIntestinal);
        nombreEnf.add("Inflamación Instestinal");
    }

}
