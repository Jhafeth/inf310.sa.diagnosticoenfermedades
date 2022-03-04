package inf310.sa.diagnosticoenfermedades;

import java.util.LinkedList;

/* @author Jhafeth */
public final class Datos {

//PRIMER ETAPA
    public final void sintomasPrimerEtapa(LinkedList<String> e, LinkedList<String> p) {
        e.add("DOLOR-PECHO");
        e.add("CUESTA-RESPIRAR");
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

        p.add("Presenta dolor en el pecho?");
        p.add("Tiene Dificultad al respirar?");
        p.add("Escucha un silbido cuando respira?");
        p.add("Presenta hinchazon en sus articulaciones");
        p.add("Tiene Erupciones en la piel?");
        p.add("Tiene Dolor de Cabeza?");
        p.add("Presenta Fiebre?");
        p.add("Presenta falta de apetito, no tiene fanas de comer?");
        p.add("Siente sensacion de llenura?");
        p.add("Siente dolor en el abdomen?");
        p.add("Tiene picazon en la piel?");
        p.add("Siente su piel seca?");
        p.add("Presenta ardor en los ojos?");
        p.add("Tiene laganas en los ojos?");
    }

    public final void enfermedadesPrimerEtapa(LinkedList<Enfermedad> enfermedades, LinkedList<String> nombreEnf) {
        Enfermedad e = new Enfermedad();
//enfermedades respiratorias: rinitis asma neumonia faringitis resfrio
        e.addSintoma("DOLOR-PECHO", 2);
        e.addSintoma("CUESTA-RESPIRAR", 3);
        e.addSintoma("SILBIDO-RESPIRAR", 5);
        enfermedades.add(e);
        nombreEnf.add("Enfermedades Respiratorias");
//enfermedades cardiacas: insuficiencia hipertension colesterol-alto
        e = new Enfermedad();
        e.addSintoma("HINCHAZON-ARTICULACION", 2);
        e.addSintoma("DOLOR-PECHO", 3);
        e.addSintoma("LATIDOS-ACELERADOS", 5);
        enfermedades.add(e);
        nombreEnf.add("Enfermedades Cardiacas");
//enfermedades virales: covid dengue mayaro fiebre-amarilla chikungunha
        e = new Enfermedad();
        e.addSintoma("ERUPCION-CUTANEA", 2);
        e.addSintoma("DOLOR-CABEZA", 3);
        e.addSintoma("FIEBRE", 5);
        enfermedades.add(e);
        nombreEnf.add("Enfermedades Virales");
//enfermedades intestinales: gastritis salmonela hepatitis inflamacion-intestinal
        e = new Enfermedad();
        e.addSintoma("FALTA-APETITO", 2);
        e.addSintoma("LLENURA", 3);
        e.addSintoma("DOLOR-ABDOMINAL", 4);
        enfermedades.add(e);
        nombreEnf.add("Enfermedades Intestinales");
//enfermedades externas: dermatitis pie-atleta conjuntivitis
        e = new Enfermedad();
        e.addSintoma("PICAZON-PIEL", 2);
        e.addSintoma("PIEL-SECA", 3);
        e.addSintoma("ARDOR-OJOS", 3);
        e.addSintoma("LAGANAS", 3);
        enfermedades.add(e);
        nombreEnf.add("Enfermedades Externas");
    }

//SEGUNDA ETAPA
    //--------------------------------------------------------------------------
    //-------------------- ENFERMEDADES RESPIRATORIAS SINTOMAS -----------------
    //--------------------------------------------------------------------------
    public final void sintomasEnfermedadesRespiratorias(LinkedList<String> respiratorias, LinkedList<String> p) {

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

        respiratorias.add("PICAZON-GARGANTA");
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

    public final void enfermedadesRespiratorias(LinkedList<Enfermedad> enfermedades, LinkedList<String> nombreEnf) {
        Enfermedad e = new Enfermedad();
        asma(e);
        enfermedades.add(e);
        nombreEnf.add("Asma");

        e = new Enfermedad();
        neumonia(e);
        enfermedades.add(e);
        nombreEnf.add("Neumonia");

        e = new Enfermedad();
        faringitis(e);
        enfermedades.add(e);
        nombreEnf.add("Faringitis");

        e = new Enfermedad();
        resfrio(e);
        enfermedades.add(e);
        nombreEnf.add("Resfrio");

        e = new Enfermedad();
        rinitis(e);
        enfermedades.add(e);
        nombreEnf.add("Resfrio");
    }

    private void asma(Enfermedad asma) {
        //Enfermedad asma = new Enfermedad();
        asma.addSintoma("CUESTA-RESPIRAR", 3);
        asma.addSintoma("DOLOR-PECHO", 2);
        asma.addSintoma("TOS", 3);
        asma.addSintoma("SILBIDO-RESPIRAR", 5);
        asma.addSintoma("INCAPACIDAD-HABLAR", 5);
    }

    private void neumonia(Enfermedad neumonia) {
        //Enfermedad neumonia = new Enfermedad();
        neumonia.addSintoma("TOS-FLEMA", 3);
        neumonia.addSintoma("NAUSEAS", 4);
        neumonia.addSintoma("VOMITO", 4);
        neumonia.addSintoma("DIARREA", 4);
        neumonia.addSintoma("FIEBRE", 2);
        neumonia.addSintoma("DOLOR-PECHO", 4);
        neumonia.addSintoma("FATIGA", 5);
        neumonia.addSintoma("ESCALOSFRIOS", 3);
    }

    private void faringitis(Enfermedad faringitis) {
        //Enfermedad faringitis = new Enfermedad();
        faringitis.addSintoma("MALESTAR-GENERAL", 2);
        faringitis.addSintoma("FIEBRE", 2);
        faringitis.addSintoma("DOLOR-DE-GARGANTA", 3);
    }

    private void resfrio(Enfermedad resfrio) {
        //Enfermedad resfrio = new Enfermedad();
        resfrio.addSintoma("FIEBRE", 2);
        resfrio.addSintoma("ESCALOSFRIOS", 3);
        resfrio.addSintoma("DOLOR-CABEZA", 2);
        resfrio.addSintoma("MALESTAR-GENERAL", 3);
        resfrio.addSintoma("SECRECION-NASAL", 4);
        resfrio.addSintoma("CONGESTION-NASAL", 4);
        resfrio.addSintoma("DOLOR-DE-GARGANTA", 3);
        resfrio.addSintoma("DOLOR-MUSCULAR", 4);
        resfrio.addSintoma("DOLOR-DE-LAS-ARTICULACIONES", 5);
    }

    private void rinitis(Enfermedad rinitis) {
        //Enfermedad rinitis = new Enfermedad();
        rinitis.addSintoma("CONGESTION-NASAL", 4);
        rinitis.addSintoma("MUCOSIDAD-GARGANTA", 5);
        rinitis.addSintoma("TOS", 2);
        rinitis.addSintoma("ESTORNUDOS", 3);
        rinitis.addSintoma("PICAZON-GARGANTA", 4);
        rinitis.addSintoma("DOLOR-DE-GARGANTA", 3);
    }

    //--------------------------------------------------------------------------
    //-------------------- ENFERMEDADES VIRALES SINTOMAS -----------------------
    //--------------------------------------------------------------------------
    public final void sintomasEnfermedadesVirales(LinkedList<String> virales, LinkedList<String> p) {

        virales.add("DIARREA");
        p.add("¿Usted tiene diarrea?");

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

        virales.add("ANOREXIA");///***********
        p.add("¿Usted padece de anorexia?");

        virales.add("DELIRIO");
        p.add("¿Ha tenido delirios?");

        virales.add("PIEL-Y-OJOS-AMARILLOS");
        p.add("¿Su piel y sus ojos estan de color amarillo?");

        virales.add("SANGRADO");
        p.add("¿Presenta hemorrágea?");

        virales.add("DOLOR-ARTICULAR");
        p.add("¿Siente dolor en sus articulaciones?");

    }

    public final void enfermedadesVirales(LinkedList<Enfermedad> enfermedades, LinkedList<String> nombreEnf) {
        Enfermedad e = new Enfermedad();
        covid(e);
        enfermedades.add(e);
        nombreEnf.add("Covid 19");

        e = new Enfermedad();
        dengue(e);
        enfermedades.add(e);
        nombreEnf.add("Dengue");

        e = new Enfermedad();
        mayaro(e);
        enfermedades.add(e);
        nombreEnf.add("Mayaro");

        e = new Enfermedad();
        fiebreAmarilla(e);
        enfermedades.add(e);
        nombreEnf.add("Fiebre Amarilla");

        e = new Enfermedad();
        chikunguna(e);
        enfermedades.add(e);
        nombreEnf.add("Chinkunguña");
    }

    private void covid(Enfermedad covid) {
        covid.addSintoma("DIARREA", 3);
        covid.addSintoma("CUESTA-RESPIRAR", 5);
        covid.addSintoma("DOLOR-CABEZA", 2);
        covid.addSintoma("DOLOR-PECHO", 5);
        covid.addSintoma("ERUPCION-CUTANEA", 2);
        covid.addSintoma("CANSACIO", 3);
        covid.addSintoma("FIEBRE", 2);
        covid.addSintoma("PERDIDA-DE-LA-MOVILIDAD", 4);
        covid.addSintoma("PERDIDA-DEL-GUSTO-Y-OLFATO", 5);
        covid.addSintoma("PERDIDA-DEL-HABLA", 4);///******
        covid.addSintoma("TOS", 4);
    }

    private void dengue(Enfermedad dengue) {
        dengue.addSintoma("DOLOR-CABEZA", 2);
        dengue.addSintoma("DOLOR-DE-GARGANTA", 3);
        dengue.addSintoma("ERUPCION-CUTANEA", 3);
        dengue.addSintoma("ESCALOSFRIOS", 3);
        dengue.addSintoma("FATIGA", 3);
        dengue.addSintoma("FIEBRE", 2);
        dengue.addSintoma("DOLOR-CORPORAL", 3);
        dengue.addSintoma("NAUSEAS", 3);
        dengue.addSintoma("FALTA-APETITO", 2);
        dengue.addSintoma("VOMITO", 3);
    }

    private void mayaro(Enfermedad mayaro) {
        mayaro.addSintoma("DIARREA", 3);
        mayaro.addSintoma("DOLOR-CABEZA", 2);
        mayaro.addSintoma("DOLOR-EN-LOS-OJOS", 5);
        mayaro.addSintoma("ERUPCION-CUTANEA", 2);
        mayaro.addSintoma("FIEBRE", 2);
        mayaro.addSintoma("MAREOS", 5);
        mayaro.addSintoma("ANOREXIA", 5);
        mayaro.addSintoma("NAUSEAS", 3);
        mayaro.addSintoma("VOMITO", 3);
    }

    private void fiebreAmarilla(Enfermedad fiebreAmarilla) {
        fiebreAmarilla.addSintoma("FIEBRE", 2);
        fiebreAmarilla.addSintoma("DELIRIO", 5);
        fiebreAmarilla.addSintoma("DOLOR-CORPORAL", 3);
        fiebreAmarilla.addSintoma("DOLOR-CABEZA", 2);
        fiebreAmarilla.addSintoma("ESCALOFRIOS", 3);
        fiebreAmarilla.addSintoma("FATIGA", 3);
        fiebreAmarilla.addSintoma("NAUSEAS", 3);
        fiebreAmarilla.addSintoma("FALTA-APETITO", 2);
        fiebreAmarilla.addSintoma("PIEL-Y-OJOS-AMARILLOS", 5);
        fiebreAmarilla.addSintoma("SANGRADO", 5);
        fiebreAmarilla.addSintoma("VOMITO", 3);
    }

    private void chikunguna(Enfermedad chikunguna) {
        chikunguna.addSintoma("FIEBRE", 2);
        chikunguna.addSintoma("DOLOR-CORPORAL", 3);
        chikunguna.addSintoma("DOLOR-CABEZA", 2);
        chikunguna.addSintoma("DOLOR-ARTICULAR", 5);
        chikunguna.addSintoma("ERUPCION-CUTANEA", 2);
        chikunguna.addSintoma("ESCALOFRIOS", 3);
        chikunguna.addSintoma("FATIGA", 3);
    }

    //--------------------------------------------------------------------------
    //------------------ ENFERMEDADES CARDIACAS SINTOMAS --------------------
    //--------------------------------------------------------------------------
    public final void sintomasEnfermedadesCardiacas(LinkedList<String> cardiacas, LinkedList<String> p) {

        cardiacas.add("HINCHAZON-ABDOMEN");
        p.add("¿Siente que su abdomen esta hinchado?");

        cardiacas.add("HINCHAZON-PIES");
        p.add("¿Usted siente sus pies hinchados?");

        cardiacas.add("VOMITOS");
        p.add("¿Presenta vómitos?");

        cardiacas.add("SANGRADO-NASAL");
        p.add("¿Presenta sangrado en la nariz?");

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

    public final void enfermedadesCardiacas(LinkedList<Enfermedad> enfermedades, LinkedList<String> nombreEnf) {
        Enfermedad e = new Enfermedad();
        insuficienciaCardiaca(e);
        enfermedades.add(e);
        nombreEnf.add("Insuficiencia Cardiaca");

        e = new Enfermedad();
        hipertensionArterial(e);
        enfermedades.add(e);
        nombreEnf.add("Hipertension Arterial");

        e = new Enfermedad();
        colesterolAlto(e);
        enfermedades.add(e);
        nombreEnf.add("Colesterol Alto");
    }

    private void insuficienciaCardiaca(Enfermedad insuficienciaCardiaca) {
        insuficienciaCardiaca.addSintoma("DOLOR-PECHO", 3);
        insuficienciaCardiaca.addSintoma("NAUSEAS", 1);
        insuficienciaCardiaca.addSintoma("CUESTA-RESPIRAR", 4);
        insuficienciaCardiaca.addSintoma("SILBIDO-RESPIRAR", 3);
        insuficienciaCardiaca.addSintoma("FATIGA", 4);
        insuficienciaCardiaca.addSintoma("LATIDOS-ACELERADOS", 5);
        insuficienciaCardiaca.addSintoma("TOS", 2);
        insuficienciaCardiaca.addSintoma("HINCHAZON-ABDOMEN", 4);
        insuficienciaCardiaca.addSintoma("FALTA-APETITO", 4);
        insuficienciaCardiaca.addSintoma("HINCHAZON-PIES", 4);
    }

    private void hipertensionArterial(Enfermedad hipertensionArterial) {
        hipertensionArterial.addSintoma("NAUSEAS", 2);
        hipertensionArterial.addSintoma("VOMITO", 2);
        hipertensionArterial.addSintoma("VISION-BORROSA", 3);
        hipertensionArterial.addSintoma("SANGRADO-NASAL", 2);
        hipertensionArterial.addSintoma("DOLOR-CABEZA", 5);
    }

    private void colesterolAlto(Enfermedad colesterolAlto) {
        colesterolAlto.addSintoma("DOLOR-PECHO", 3);
        colesterolAlto.addSintoma("BOCA-SECA", 2);
        colesterolAlto.addSintoma("DOLOR-CABEZA", 2);
        colesterolAlto.addSintoma("INDIGESTION", 2);
        colesterolAlto.addSintoma("URTICARIA", 3);
        colesterolAlto.addSintoma("HINCHAZON-EXTREMIDADES", 5);
        colesterolAlto.addSintoma("DIFICULTAD-INTESTINAL", 4);
        colesterolAlto.addSintoma("VISION-BORROSA", 5);
    }

    //--------------------------------------------------------------------------
    //-------------------- ENFERMEDADES EXTERNAS -----------------------
    //--------------------------------------------------------------------------
    public final void sintomasEnfermedadesExternas(LinkedList<String> externas, LinkedList<String> p) {
        externas.add("PIEL-SENSIBLE");
        p.add("¿Usted tiene piel sensible?");

        externas.add("DESCAMACION-PIEL");
        p.add("¿Usted tiene descamacion de la piel?");

        externas.add("AMPOLLAS");
        p.add("¿Usted tiene ampollas?");

        externas.add("PIEL-ENGROSADA");
        p.add("¿Usted tiene piel engrosada?");

        externas.add("OJO-ROJO");
        p.add("¿Usted tiene ojos enrojecidos?");

        externas.add("OJO-INFLAMADO");
        p.add("¿Usted tiene inflamacion en los parpados?");

        externas.add("LAGRIMEO");
        p.add("¿Usted tiene lagrimeo de ojos?");

        externas.add("SENSIBILIDAD-LUZ");
        p.add("¿Usted tiene sensibilidad a la luz?");

        externas.add("PARPADOS-PEGADOS");
        p.add("¿Usted tiene parpados ligeramente pegados?");

        externas.add("PIEL-INFLAMADA");
        p.add("¿Usted tiene piel inflamada?");

        externas.add("ARDOR-PIEL");
        p.add("¿Usted tiene ardor o escozor en la piel?");
    }

    public final void enfermedadesExternas(LinkedList<Enfermedad> enfermedades, LinkedList<String> nombreEnf) {
        Enfermedad e = new Enfermedad();
        dermatitis(e);
        enfermedades.add(e);
        nombreEnf.add("Dermatitis");

        e = new Enfermedad();
        conjuntivitis(e);
        enfermedades.add(e);
        nombreEnf.add("Conjuntivitis");

        e = new Enfermedad();
        pieDeAtleta(e);
        enfermedades.add(e);
        nombreEnf.add("Pie de Atleta");

        e = new Enfermedad();
        dishidrosis(e);
        enfermedades.add(e);
        nombreEnf.add("Dishidrosis");
    }

    private void dermatitis(Enfermedad dermatitis) {
        dermatitis.addSintoma("PICAZON", 2);
        dermatitis.addSintoma("PIEL-SECA", 3);
        dermatitis.addSintoma("DESCAMACION-PIEL", 2);
        dermatitis.addSintoma("ERUPCION-CUTANEA", 2);
        dermatitis.addSintoma("AMPOLLAS", 3);
        dermatitis.addSintoma("PIEL-ENGROSADA", 4);
    }

    private void conjuntivitis(Enfermedad conjuntivitis) {
        conjuntivitis.addSintoma("OJO-ROJO", 4);
        conjuntivitis.addSintoma("OJO-INFLAMADO", 5);
        conjuntivitis.addSintoma("LAGRIMEO", 4);
        conjuntivitis.addSintoma("SENSIBILIDAD-LUZ", 4);
        conjuntivitis.addSintoma("ARDOR-OJOS", 2);
        conjuntivitis.addSintoma("LAGANAS", 5);
        conjuntivitis.addSintoma("PARPADOS-PEGADOS", 5);
    }

    private void pieDeAtleta(Enfermedad pieDeAtleta) {
        pieDeAtleta.addSintoma("DESCAMACION-PIEL", 4);
        pieDeAtleta.addSintoma("PICAZON-PIEL", 2);
        pieDeAtleta.addSintoma("PIEL-SECA", 4);
        pieDeAtleta.addSintoma("PIEL-INFLAMADA", 5);
        pieDeAtleta.addSintoma("ARDOR-PIEL", 5);
        pieDeAtleta.addSintoma("AMPOLLAS", 4);
    }

    private void dishidrosis(Enfermedad dishidrosis) {
        dishidrosis.addSintoma("ERUPCION-CUTANEA", 2);
        dishidrosis.addSintoma("PICAZON-PIEL", 3);
        dishidrosis.addSintoma("PIEL-SENSIBLE", 2);
        dishidrosis.addSintoma("ARDOR-PIEL", 3);
    }

    //--------------------------------------------------------------------------
    //-------------------- ENFERMEDADES INTESTINALES -----------------------
    //--------------------------------------------------------------------------
    public void sintomasEnfermedadesInstetinales(LinkedList<String> instestinales, LinkedList<String> p) {
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

        instestinales.add("OJO-AMARILLO");
        p.add("¿Presenta decoloración amarilla en los ojos?");

        instestinales.add("PIEL-AMARILLA");
        p.add("¿Presenta decoloración amarilla en la piel?");

        instestinales.add("ORINA-AMARILLA");
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

    public final void enfermedadesIntestinales(LinkedList<Enfermedad> enfermedades, LinkedList<String> nombreEnf) {
        Enfermedad e = new Enfermedad();
        gastritis(e);
        enfermedades.add(e);
        nombreEnf.add("Gastritis");

        e = new Enfermedad();
        salmonela(e);
        enfermedades.add(e);
        nombreEnf.add("Salmonela");

        e = new Enfermedad();
        hepatitis(e);
        enfermedades.add(e);
        nombreEnf.add("Hepatitis");

        e = new Enfermedad();
        inflamacionIntestinal(e);
        enfermedades.add(e);
        nombreEnf.add("Inflamación Instestinal");
    }

    private void gastritis(Enfermedad gastritis) {
        gastritis.addSintoma("DOLOR-ABDOMINAL", 1);
        gastritis.addSintoma("NAUSEAS", 1);
        gastritis.addSintoma("VOMITO", 1);
        gastritis.addSintoma("LLENURA", 1);
        gastritis.addSintoma("FALTA-APETITO", 4);
        gastritis.addSintoma("PERDIDA-PESO", 4);
    }

    private void salmonela(Enfermedad salmonela) {
        salmonela.addSintoma("NAUSEAS", 1);
        salmonela.addSintoma("VOMITO", 1);
        salmonela.addSintoma("CALAMBRE-ABDOMINAL", 4);
        salmonela.addSintoma("DIARREA", 2);
        salmonela.addSintoma("ESCALOFRIOS", 3);
        salmonela.addSintoma("DOLOR-CABEZA", 1);
        salmonela.addSintoma("SANGRE-HECES", 4);
    }

    private void hepatitis(Enfermedad hepatitis) {
        hepatitis.addSintoma("DIARREA", 3);
        hepatitis.addSintoma("FATIGA", 2);
        hepatitis.addSintoma("DOLOR-ABDOMINAL", 3);
        hepatitis.addSintoma("PERDIDA-PESO", 3);
        hepatitis.addSintoma("FALTA-APETITO", 3);
        hepatitis.addSintoma("SANGRE-HECES", 5);
    }

    private void inflamacionIntestinal(Enfermedad inflamacionIntestinal) {
        inflamacionIntestinal.addSintoma("FIEBRE", 2);
        inflamacionIntestinal.addSintoma("DOLOR-ABDOMINAL", 1);
        inflamacionIntestinal.addSintoma("OJO-AMARILLO", 5);
        inflamacionIntestinal.addSintoma("PIEL-AMARILLA", 5);
        inflamacionIntestinal.addSintoma("FALTA-APETITO", 3);
        inflamacionIntestinal.addSintoma("NAUSEAS", 3);
        inflamacionIntestinal.addSintoma("VOMITO", 3);
        inflamacionIntestinal.addSintoma("PICAZON-PIEL", 2);
        inflamacionIntestinal.addSintoma("ORINA-AMARILLA", 4);
        inflamacionIntestinal.addSintoma("DOLOR-ARTICULAR", 2);
    }

}
