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

    //--------------------------------------------------------------------------
    //-------------------- ENFERMEDADES VIRALES SINTOMAS -----------------------
    //--------------------------------------------------------------------------
    private void enfermedadesViralesSintomas() {
        LinkedList<String> virales = new LinkedList<>();
        LinkedList<String> p = new LinkedList<>();
        virales.add("DIARREA");
        p.add("¿Usted tiene diarrea?");
        
        virales.add("DIFICULTAD-PARA-RESPIRAR");
        p.add("¿Presenta dificultad para respirar?");
        
        virales.add("DOLOR-EN-EL-PECHO");
        p.add("¿Siente dolor en el pecho?");
        
        virales.add("ERUPCION-CUTANEA");
        p.add("¿Usted presenta erupciones cutáneas?");
        
        virales.add("CANSANCIO");
        p.add("¿Usted se siente cansado/a?");
        
        virales.add("PERDIDA-DE-LA-MOVILIDAD");
        p.add("¿Siente que ha perdido alguna parte de movilidad en su cuerpo?");
        
        virales.add("PERDIDA-DEL-GUSTO-Y-OLFATO");
        p.add("¿Ha perdido el sentido del gusto y del olfato?");
        
        virales.add("PERDIDA-DEL-HABLA");
        p.add("¿Ha perdido la voz?");
        
        virales.add("TOS");
        p.add("¿Presenta tos?");
        
        virales.add("DOLOR-DE-GARGANTA");
        p.add("¿Presenta dolor de garganta?");
        
        virales.add("FATIGA");
        p.add("¿Tiene fatiga?");
        
        virales.add("VOMITO");
        p.add("¿Presenta vómitos?");
        
        virales.add("ESCALOSFRIOS");
        p.add("¿Siente escalosfrios?");
        
        virales.add("NAUSEAS");
        p.add("¿Usted siente náuseas?");
        
        virales.add("DOLOR-EN-LOS-OJOS");
        p.add("¿Tiene dolor en los ojos?");
        
        virales.add("MAREOS");
         p.add("¿Se siente mareado?");
         
        virales.add("ANOREXIA");
        p.add("¿Usted padece de anorexia?");
        
        virales.add("DOLOR-ABDOMINAL");
        p.add("¿Presenta dolor abdominal?");
         
        virales.add("DELIRIO");
        p.add("¿Ha tenido delirios?");
        
        virales.add("PIEL-Y-OJOS-AMARILLOS");
        p.add("¿Su piel y sus ojos estan de color amarillo?");
        
        virales.add("SANGRADO");
         p.add("¿Presenta hemorrágea?");
         
        virales.add("DOLOR-ARTICULAR");
        p.add("¿Siente dolor en sus articulaciones?");

    }

    // COVID
    private void covid() {
        Enfermedad covid = new Enfermedad();
        covid.addSintoma("DIARREA", 3);
        covid.addSintoma("DIFICULTAD-PARA-RESPIRAR", 5);
        covid.addSintoma("DOLOR-DE-CABEZA", 2);
        covid.addSintoma("DOLOR-EN-EL-PECHO", 5);
        covid.addSintoma("ERUPCION-CUTANEA", 2);
        covid.addSintoma("CANSACIO", 3);
        covid.addSintoma("FIEBRE", 2);
        covid.addSintoma("PERDIDA-DE-LA-MOVILIDAD", 4);
        covid.addSintoma("PERDIDA-DEL-GUSTO-Y-OLFATO", 5);
        covid.addSintoma("PERDIDA-DEL-HABLA", 4);
        covid.addSintoma("TOS", 4);
        enfermedades.add(covid);
        nombreEnf.add("Covid 19");
    }

    // DENGUE
        private void dengue() {
        Enfermedad dengue = new Enfermedad();
        dengue.addSintoma("DOLOR-DE-CABEZA", 2);
        dengue.addSintoma("DOLOR-DE-GARGANTA", 3);
        dengue.addSintoma("ERUPCION-CUTANEA", 3);
        dengue.addSintoma("ESCALOSFRIOS", 3);
        dengue.addSintoma("FATIGA", 3);
        dengue.addSintoma("FIEBRE", 2);
        dengue.addSintoma("DOLOR-CORPORAL", 3);
        dengue.addSintoma("NAUSEAS", 3);
        dengue.addSintoma("FALTA-APETITO", 2);
        dengue.addSintoma("VOMITO", 3);
        enfermedades.add(dengue);
        nombreEnf.add("Dengue");
    }
    // MAYARO
        private void mayaro() {
        Enfermedad mayaro = new Enfermedad();
        mayaro.addSintoma("DIARREA", 3);
        mayaro.addSintoma("DOLOR-DE-CABEZA", 2);
        mayaro.addSintoma("DOLOR-EN-LOS-OJOS", 5);
        mayaro.addSintoma("ERUPCION-CUTANEA", 2);
        mayaro.addSintoma("FIEBRE", 2);
        mayaro.addSintoma("MAREOS", 5);
        mayaro.addSintoma("ANOREXIA", 5);
        mayaro.addSintoma("NAUSEAS", 3);
        mayaro.addSintoma("VOMITO", 3);
        enfermedades.add(mayaro);
        nombreEnf.add("Mayaro");
    } 
    // FIEBRE-AMARILLA
        private void fiebreAmarilla() {
        Enfermedad fiebreAmarilla = new Enfermedad();
        fiebreAmarilla.addSintoma("FIEBRE", 2);
        fiebreAmarilla.addSintoma("DELIRIO", 5);
        fiebreAmarilla.addSintoma("DOLOR-CORPORAL", 3);
        fiebreAmarilla.addSintoma("DOLOR-DE-CABEZA", 2);
        fiebreAmarilla.addSintoma("ESCALOFRIOS", 3);
        fiebreAmarilla.addSintoma("FATIGA", 3);
        fiebreAmarilla.addSintoma("NAUSEAS", 3);
        fiebreAmarilla.addSintoma("FALTA-APETITO", 2);
        fiebreAmarilla.addSintoma("PIEL-Y-OJOS-AMARILLOS", 5);
        fiebreAmarilla.addSintoma("SANGRADO", 5);
        fiebreAmarilla.addSintoma("VOMITO", 3);
        enfermedades.add(fiebreAmarilla);
        nombreEnf.add("Fiebre Amarilla");
    }
    // CHINKUNGUNHA
        private void chikunguna() {
        Enfermedad chikunguna = new Enfermedad();
        chikunguna.addSintoma("FIEBRE", 2);
        chikunguna.addSintoma("DOLOR-CORPORAL", 3);
        chikunguna.addSintoma("DOLOR-DE-CABEZA", 2);
        chikunguna.addSintoma("DOLOR-ARTICULAR", 5);
        chikunguna.addSintoma("ERUPCION-CUTANEA", 2);
        chikunguna.addSintoma("ESCALOFRIOS", 3);
        chikunguna.addSintoma("FATIGA", 3);
        enfermedades.add(chikunguna);
        nombreEnf.add("Chinkunguña");
    }
        
    //--------------------------------------------------------------------------
    //------------------ ENFERMEDADES INTESTINALES SINTOMAS --------------------
    //--------------------------------------------------------------------------
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
