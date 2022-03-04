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
    /**********SINTOMAS DE LA PRIMERA RONDA: NO REPETIR EN PREGUNTAS CATEGÓRICAS***********
        e.add("DOLOR-PECHO"); 
        e.add("CUESTA-RESPIRAR");1
        e.add("SILBIDO-RESPIRAR");
        e.add("HINCHAZON-ARTICULACION");
        e.add("LATIDOS-ACELERADOS");
        e.add("ERUPCION-CUTANEA");
        e.add("DOLOR-CABEZA");
        e.add("FIEBRE");
        e.add("FALTA-APETITO");
        e.add("LLENURA");
        e.add("DOLOR-ABDOMINAL");
        e.add("PICAZON-PIEL");
        e.add("PIEL-SECA");
        e.add("ARDOR-OJOS");
        e.add("LAGANAS");
    *************FIN DE SINTOMAS DE LA PRIMERA RONDA*****************************************/
    
    //--------------------------------------------------------------------------
    //-------------------- ENFERMEDADES RESPIRATORIAS SINTOMAS -----------------
    //--------------------------------------------------------------------------
    private void enfermedadesRespiratoriasSintomas() {
        
        LinkedList<String> respiratorias = new LinkedList<>();
        LinkedList<String> p = new LinkedList<>();
        respiratorias.add("DIFICULTAD-PARA-RESPIRAR");//Supuestamente dificultad respiratoria 
                                                        //y falta de aire es lo mismo
        p.add("¿Presenta dificultad para respirar?");
        
        respiratorias.add("TOS");
        p.add("¿Presenta tos?");
        
        respiratorias.add("INCAPACIDAD-HABLAR");
        p.add("¿Presenta alguna dificultad para hablar?");
        
        respiratorias.add("TOS-FLEMA");
        p.add("¿Presenta tos con flema?");
        
        respiratorias.add("NAUSEAS");
        p.add("¿Presenta náuseas?");
        
        respiratorias.add("DOLOR-DE-GARGANTA");
        p.add("¿Presenta dolor de garganta?");
        
        respiratorias.add("MALESTAR-GENERAL");
        p.add("¿Presenta una sensación de malestar general?");
        
        respiratorias.add("SECRECION-NASAL");
        p.add("¿Presenta secreción nasal de algun tipo?");
        
        respiratorias.add("DOLOR-MUSCULAR");
        p.add("¿Presenta dolor muscular?");
        
        respiratorias.add("DOLOR-DE-LAS-ARTICULACIONES");
        p.add("¿Presenta dolor en las articulaciones?");
        
        respiratorias.add("CONGESTION-NASAL");
        p.add("¿Presenta congestión nasal?");
        
        respiratorias.add("ESTORNUDOS");
        p.add("¿Presenta estornudos?");
        
        respiratorias.add("PICAZON");
        p.add("¿Presenta picazón en los ojos o garganta?");
        
        respiratorias.add("FATIGA");
        p.add("¿Presenta fatiga?");
        
        respiratorias.add("ESCALOSFRIOS");
        p.add("¿Presenta escalosfrios?");
        
        respiratorias.add("VOMITO");
        p.add("¿Presenta vómito?");
        
        respiratorias.add("DIARREA");
        p.add("¿Presenta diarrea?");
        
        respiratorias.add("MUCOSIDAD-GARGANTA");
        p.add("¿Presenta alguna sensacion de mucosidad en la garganta?");
    }
    //ASMA
    private void asma(){
        Enfermedad asma=new Enfermedad();
        asma.addSintoma("DIFICULTAD-PARA-RESPIRAR", 3);
        asma.addSintoma("DOLOR-PECHO", 2);
        asma.addSintoma("TOS", 3);
        asma.addSintoma("SILBIDO-RESPIRAR", 5);
        asma.addSintoma("INCAPACIDAD-HABLAR", 5);
    }
    //NEUMONIA
    private void neumonia(){
        Enfermedad neumonia=new Enfermedad();
        neumonia.addSintoma("TOS-FLEMA", 3);
        neumonia.addSintoma("NAUSEAS", 4);
        neumonia.addSintoma("VOMITO", 4);
        neumonia.addSintoma("DIARREA", 4);
        neumonia.addSintoma("FIEBRE", 2);
        neumonia.addSintoma("DOLOR-PECHO", 4);
        neumonia.addSintoma("FATIGA", 5);
        neumonia.addSintoma("ESCALOSFRIOS", 3);
    }
    //FARINGITIS
    private void faringitis(){
        Enfermedad faringitis=new Enfermedad();
        faringitis.addSintoma("MALESTAR-GENERAL", 2);
        faringitis.addSintoma("FIEBRE", 2);
        faringitis.addSintoma("DOLOR-DE-GARGANTA", 3);
    }
    //RESFRIO
    private void resfrio(){
        Enfermedad resfrio=new Enfermedad();
        resfrio.addSintoma("FIEBRE", 2);
        resfrio.addSintoma("ESCALOSFRIOS", 3);
        resfrio.addSintoma("DOLOR-DE-CABEZA", 2);
        resfrio.addSintoma("MALESTAR-GENERAL", 3);
        resfrio.addSintoma("SECRECION-NASAL", 4);
        resfrio.addSintoma("CONGESTION-NASAL", 4);
        resfrio.addSintoma("DOLOR-DE-GARGANTA", 3);
        resfrio.addSintoma("DOLOR-MUSCULAR", 4);
        resfrio.addSintoma("DOLOR-DE-LAS-ARTICULACIONES", 5);
    }
    //RINITIS
    private void rinitis(){
        Enfermedad rinitis=new Enfermedad();
        rinitis.addSintoma("CONGESTION-NASAL", 4);
        rinitis.addSintoma("MUCOSIDAD-GARGANTA", 5);
        rinitis.addSintoma("TOS", 2);
        rinitis.addSintoma("ESTORNUDOS", 3);
        rinitis.addSintoma("PICAZON", 4);
        rinitis.addSintoma("DOLOR-DE-GARGANTA", 3);
    }
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
    //------------------ ENFERMEDADES CARDIACAS SINTOMAS --------------------
    //--------------------------------------------------------------------------
    private void SintomasCardiacas() {
        LinkedList<String> cardiacas = new LinkedList<>();
        LinkedList<String> p = new LinkedList<>();
        cardiacas.add("FALTA-ALIENTO-ACTIVIDAD-FISICA");
        p.add("¿Usted siente falta de aliento cuando hace actividad fisica?");
        cardiacas.add("LATIDOS-ACELERADOS");
        p.add("¿Siente que sus latidos son acelerados?");
        cardiacas.add("HINCHAZON-ABDOMEN");
        p.add("¿Siente que su abdomen esta hinchado?");
        cardiacas.add("FALTA-APETITO");
        p.add("¿Usted tiene falta de apetito?");
        cardiacas.add("HINCHAZON-PIES");
        p.add("¿Usted siente sus pies hinchados?");
        cardiacas.add("SILBANCIA");
        p.add("¿Escucha un pequeño silbido al respirar?");
        cardiacas.add("VOMITOS");
        p.add("¿Presenta vómitos?");
        cardiacas.add("CONFUSION");
        p.add("¿Usted tiene complicación para estar consciente?");
        cardiacas.add("CAMBIO-VISION");
        p.add("¿Usted siente que su vista cambia?");
        cardiacas.add("SANGRADO-NASAL");
        p.add("¿Presenta sangrado en la nariz?");
        cardiacas.add("BOCA-SECA");
        p.add("¿Siente que su boca esta reseca?");
        cardiacas.add("INDIGESTION");
        p.add("¿Presenta problemas estomacales como indigestión?");
        cardiacas.add("BOCA-SECA");
        p.add("¿Siente que su boca esta reseca?");
        cardiacas.add("INDIGESTION");
        p.add("¿Presenta problemas estomacales como indigestión?");
        cardiacas.add("URTICARIA");
        p.add("¿Presenta enrojecimiento y ardor en la piel?");
        cardiacas.add("HINCHAZON-EXTREMIDADES");
        p.add("¿Siente que sus pies y brazos estan hinchados?");
        cardiacas.add("DIFICULTAD-INTESTINAL");
        p.add("¿Tiene problemas para ir al baño?");
        cardiacas.add("VISION-BORROSA");
        p.add("¿Usted siente que su vista esta borrosa?");
    }

    private void SintomasInsuficienciaCardiaca() {
        Enfermedad insuficienciaCardiaca = new Enfermedad();
        insuficienciaCardiaca.addSintoma("DOLOR-PECHO", 3);
        insuficienciaCardiaca.addSintoma("NAUSEAS", 1);
        insuficienciaCardiaca.addSintoma("FALTA-ALIENTO-ACTIVIDAD-FISICA", 4);
        insuficienciaCardiaca.addSintoma("SILBANCIA", 3);
        insuficienciaCardiaca.addSintoma("FATIGA", 4);
        insuficienciaCardiaca.addSintoma("LATIDOS-ACELERADOS", 5);
        insuficienciaCardiaca.addSintoma("TOS", 2);
        insuficienciaCardiaca.addSintoma("HINCHAZON-ABDOMEN", 4);
        insuficienciaCardiaca.addSintoma("FALTA-APETITO", 4);
        insuficienciaCardiaca.addSintoma("HINCHAZON-PIES", 4);

        enfermedades.add(insuficienciaCardiaca);
        nombreEnf.add("Insuficiencia Cardiaca");

    }

    private void SintomasHipertensionArterial() {
        Enfermedad hipertensionArterial = new Enfermedad();
        hipertensionArterial.addSintoma("NAUSEAS", 2);
        hipertensionArterial.addSintoma("VOMITO", 2);
        hipertensionArterial.addSintoma("CONFUSION", 4);
        hipertensionArterial.addSintoma("CAMBIO-VISION", 3);
        hipertensionArterial.addSintoma("SANGRADO-NASAL", 2);
        hipertensionArterial.addSintoma("DOLOR-DE-CABEZA", 5);
        
        enfermedades.add(hipertensionArterial);
        nombreEnf.add("Hipertension Arterial");
    }

    private void SintomasColesterolAlto() {
        Enfermedad colesterolAlto = new Enfermedad();
        colesterolAlto.addSintoma("DOLOR-PECHO", 3);
        colesterolAlto.addSintoma("BOCA-SECA", 2);
        colesterolAlto.addSintoma("DOLOR-CABEZA", 2);
        colesterolAlto.addSintoma("INDIGESTION", 2);
        colesterolAlto.addSintoma("URTICARIA", 3);

        colesterolAlto.addSintoma("HINCHAZON-EXTREMIDADES", 5);
        colesterolAlto.addSintoma("DIFICULTAD-INTESTINAL", 4);
        colesterolAlto.addSintoma("VISION-BORROSA", 5);
        enfermedades.add(colesterolAlto);
        nombreEnf.add("Colesterol Alto");

    }
    
    //--------------------------------------------------------------------------
    //-------------------- ENFERMEDADES EXTERNAS -----------------------
    //--------------------------------------------------------------------------
     private void enfermedadesExternasSintomas() {
        LinkedList<String> externas = new LinkedList<>();
        LinkedList<String> p = new LinkedList<>();
        
        externas.add("INCOMODIDAD");
        p.add("¿Usted tiene incomodidad en la piel?");
        
        externas.add("PIEL SENSIBLE");
        p.add("¿Usted tiene piel sensible?");
        
        externas.add("PIEL SECA");
        p.add("¿Usted tiene piel seca?");
        
        externas.add("DESCAMACION DE LA PIEL");
        p.add("¿Usted tiene descamacion de la piel?");
        
        externas.add("AMPOLLAS");
        p.add("¿Usted tiene ampollas?");
        
        externas.add("PIEL ENGROSADA");
        p.add("¿Usted tiene piel engrosada?");
        
        externas.add("ENROJECIMIENTO DE LA PARTE BLANCA DEL OJO");
        p.add("¿Usted tiene ojos enrojecidos?");
        
        externas.add("INFLAMACION DE LA CONJUNTIVA O DE LOS PARPADOS");
        p.add("¿Usted tiene inflamacion en los parpados?");
        
        externas.add("LAGRIMEO");
        p.add("¿Usted tiene lagrimeo de ojos?");
        
        externas.add("SENSIBILIDAD A LA LUZ");
        p.add("¿Usted tiene sensibilidad a la luz?");
        
        externas.add("LAGAÑAS VERDES O AMARILLAS");
        p.add("¿Usted tiene lagañas verdes o amarillas?");
        
        externas.add("PÁRPADOS LIGERAMENTE PEGADOS");
        p.add("¿Usted tiene parpados ligeramente pegados?");
        
        externas.add("PIEL ESCAMOSA");
        p.add("¿Usted tiene piel escamosa?");
 
        externas.add("PIEL INFLAMADA");
        p.add("¿Usted tiene piel inflamada?");
        
        externas.add("ARDOR O ESCOZOR");
        p.add("¿Usted tiene ardor o escozor?");
        
     }
     
     // DERMATITIS
    private void dermatitis() {
        Enfermedad dermatitis = new Enfermedad();
        dermatitis.addSintoma("PICAZÓN", 2);
        dermatitis.addSintoma("PIEL SECA", 3);
        dermatitis.addSintoma("DESCAMACIÓN DE LA PIEL", 2);
        dermatitis.addSintoma("ERUPCIÓN", 2);
        dermatitis.addSintoma("AMPOLLAS", 3);
        dermatitis.addSintoma("PIEL ENGROSADA", 4);
        enfermedades.add(dermatitis);
        nombreEnf.add("Dermatitis");
    }
    
    // CONJUNTIVITIS
    private void conjuntivitis() {
        Enfermedad conjuntivitis = new Enfermedad();
        conjuntivitis.addSintoma("ENROJECIMIENTO DE LA PARTE BLANCA DEL OJO", 4);
        conjuntivitis.addSintoma("INFLAMACIÓN DE LA CONJUNTIVA O DE LOS PÁRPADOS", 5);
        conjuntivitis.addSintoma("LAGRIMEO", 4);
        conjuntivitis.addSintoma("SENSIBILIDAD A LA LUZ", 4);
        conjuntivitis.addSintoma("PICAZÓN, IRRITACIÓN O ARDOR", 2);
        conjuntivitis.addSintoma("LAGAÑAS VERDES O AMARILLAS", 5);
        conjuntivitis.addSintoma("PÁRPADOS LIGERAMENTE PEGADOS", 5);
        enfermedades.add(conjuntivitis);
        nombreEnf.add("Conjuntivitis");
    }
    
    // PIE DE ATLETA
    private void pieDeAtleta() {
        Enfermedad pieDeAtleta = new Enfermedad();
        pieDeAtleta.addSintoma("PIEL ESCAMOSA", 4);
        pieDeAtleta.addSintoma("PICAZÓN", 2);
        pieDeAtleta.addSintoma("PIEL SECA", 4);
        pieDeAtleta.addSintoma("PIEL INFLAMADA", 5);
        pieDeAtleta.addSintoma("ARDOR O ESCOZOR", 5);
        pieDeAtleta.addSintoma("AMPOLLAS", 4);
        enfermedades.add(pieDeAtleta);
        nombreEnf.add("Pie de Atleta");
    }
    
    // DISHIDROSIS
    private void dishidrosis() {
        Enfermedad dishidrosis = new Enfermedad();
        dishidrosis.addSintoma("ERUPCIÓN EN LA PIEL EN FORMA DE LLAGA", 2);
        dishidrosis.addSintoma("PICAZÓN", 3);
        dishidrosis.addSintoma("INCOMODIDAD", 3);
        dishidrosis.addSintoma("PIEL SENSIBLE", 2);
        dishidrosis.addSintoma("ARDOR", 3);
        enfermedades.add(dishidrosis);
        nombreEnf.add("Dishidrosis");
    }
    
    //--------------------------------------------------------------------------
    //-------------------- ENFERMEDADES INTESTINALES -----------------------
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
    
    //GASTRITIS
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

    //SALMONELA
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
    
    //HEPATITIS
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

    //INFLAMACION INTESTINAL
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
