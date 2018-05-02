package ar.edu.untref.aydoo;

import org.junit.*;

public class CamaraElectoralTest {

    @Test
    public void votacionPrimariaAbiertasSimultaneasObligatoriasParaCadaProvincia() {

        CamaraElectoral camaraElectoral = new CamaraElectoral();

        Provincia catamarca = new Provincia("Catamarca");
        Provincia caba = new Provincia ("Ciudad Autonoma de Buenos Aires");
        Provincia cordoba = new Provincia("Cordoba");
        Provincia corrientes = new Provincia("Corrientes");
        Provincia chaco = new Provincia("Chaco");
        Provincia chubut = new Provincia("Chubut");
        Provincia entreRios= new Provincia("Entre Rios");
        Provincia formosa = new Provincia("Formosa");
        Provincia jujuy = new Provincia("Jujuy");
        Provincia laPampa= new Provincia("La Pampa");
        Provincia laRioja= new Provincia("La Rioja");
        Provincia mendoza = new Provincia("Mendoza");
        Provincia misiones = new Provincia("Misiones");
        Provincia neuquen = new Provincia("Neuquen");
        Provincia buenosAires= new Provincia("Provincia de Buenos Aires");
        Provincia rioNegro= new Provincia("Rio Negro");
        Provincia salta = new Provincia("Salta");
        Provincia sanJuan = new Provincia("San Juan");
        Provincia sanLuis = new Provincia("San Luis");
        Provincia santaCruz = new Provincia("Santa Cruz");
        Provincia santaFe = new Provincia("Santa Fe");
        Provincia santiagoDelEstero= new Provincia("Santiago del Estero");
        Provincia tierraDelFuego = new Provincia("Tierra del Fuego, Antartida e Isla del Atlantico Sur");
        Provincia tucuman = new Provincia("Tucuman");

        Votante votanteCatamarca1 = new Votante(catamarca);
        Votante votanteCatamarca2 = new Votante(catamarca);
        Votante votanteCatamarca3 = new Votante(catamarca);
        Votante votanteCatamarca4 = new Votante(catamarca);
        Votante votanteCatamarca5 = new Votante(catamarca);

        Votante votanteCaba1 = new Votante(caba);
        Votante votanteCaba2 = new Votante(caba);
        Votante votanteCaba3 = new Votante(caba);
        Votante votanteCaba4 = new Votante(caba);
        Votante votanteCaba5 = new Votante(caba);

        Votante votanteCordoba1 = new Votante(cordoba);
        Votante votanteCordoba2 = new Votante(cordoba);
        Votante votanteCordoba3 = new Votante(cordoba);
        Votante votanteCordoba4 = new Votante(cordoba);
        Votante votanteCordoba5 = new Votante(cordoba);

        Votante votanteCorrientes1 = new Votante(corrientes);
        Votante votanteCorrientes2 = new Votante(corrientes);
        Votante votanteCorrientes3 = new Votante(corrientes);
        Votante votanteCorrientes4 = new Votante(corrientes);
        Votante votanteCorrientes5 = new Votante(corrientes);

        Votante votanteChaco1 = new Votante(chaco);
        Votante votanteChaco2 = new Votante(chaco);
        Votante votanteChaco3 = new Votante(chaco);
        Votante votanteChaco4 = new Votante(chaco);
        Votante votanteChaco5 = new Votante(chaco);

        Votante votanteChubut1 = new Votante(chubut);
        Votante votanteChubut2 = new Votante(chubut);
        Votante votanteChubut3 = new Votante(chubut);
        Votante votanteChubut4 = new Votante(chubut);
        Votante votanteChubut5 = new Votante(chubut);

        Votante votanteEentreRios1 = new Votante(entreRios);
        Votante votanteEentreRios2 = new Votante(entreRios);
        Votante votanteEentreRios3 = new Votante(entreRios);
        Votante votanteEentreRios4 = new Votante(entreRios);
        Votante votanteEentreRios5 = new Votante(entreRios);

        Votante votanteFormosa1 = new Votante(formosa);
        Votante votanteFormosa2 = new Votante(formosa);
        Votante votanteFormosa3 = new Votante(formosa);
        Votante votanteFormosa4 = new Votante(formosa);
        Votante votanteFormosa5 = new Votante(formosa);

        Votante votanteJujuy1 = new Votante(jujuy);
        Votante votanteJujuy2 = new Votante(jujuy);
        Votante votanteJujuy3 = new Votante(jujuy);
        Votante votanteJujuy4 = new Votante(jujuy);
        Votante votanteJujuy5 = new Votante(jujuy);

        Votante votanteLaPampa1 = new Votante(laPampa);
        Votante votanteLaPampa2 = new Votante(laPampa);
        Votante votanteLaPampa3 = new Votante(laPampa);
        Votante votanteLaPampa4 = new Votante(laPampa);
        Votante votanteLaPampa5 = new Votante(laPampa);

        Votante votanteLaRioja1 = new Votante(laRioja);
        Votante votanteLaRioja2 = new Votante(laRioja);
        Votante votanteLaRioja3 = new Votante(laRioja);
        Votante votanteLaRioja4 = new Votante(laRioja);
        Votante votanteLaRioja5 = new Votante(laRioja);

        Votante votanteMendoza1 = new Votante(mendoza);
        Votante votanteMendoza2 = new Votante(mendoza);
        Votante votanteMendoza3 = new Votante(mendoza);
        Votante votanteMendoza4 = new Votante(mendoza);
        Votante votanteMendoza5 = new Votante(mendoza);

        Votante votanteMisiones1 = new Votante(misiones);
        Votante votanteMisiones2 = new Votante(misiones);
        Votante votanteMisiones3 = new Votante(misiones);
        Votante votanteMisiones4 = new Votante(misiones);
        Votante votanteMisiones5 = new Votante(misiones);

        Votante votanteNeuquen1 = new Votante(neuquen);
        Votante votanteNeuquen2 = new Votante(neuquen);
        Votante votanteNeuquen3 = new Votante(neuquen);
        Votante votanteNeuquen4 = new Votante(neuquen);
        Votante votanteNeuquen5 = new Votante(neuquen);

        Votante votanteBuenosAires1 = new Votante(buenosAires);
        Votante votanteBuenosAires2 = new Votante(buenosAires);
        Votante votanteBuenosAires3 = new Votante(buenosAires);
        Votante votanteBuenosAires4 = new Votante(buenosAires);
        Votante votanteBuenosAires5 = new Votante(buenosAires);

        Votante votanteRioNegro1 = new Votante(rioNegro);
        Votante votanteRioNegro2 = new Votante(rioNegro);
        Votante votanteRioNegro3 = new Votante(rioNegro);
        Votante votanteRioNegro4 = new Votante(rioNegro);
        Votante votanteRioNegro5 = new Votante(rioNegro);

        Votante votanteSalta1 = new Votante(salta);
        Votante votanteSalta2 = new Votante(salta);
        Votante votanteSalta3 = new Votante(salta);
        Votante votanteSalta4 = new Votante(salta);
        Votante votanteSalta5 = new Votante(salta);

        Votante votanteSanJuan1 = new Votante(sanJuan);
        Votante votanteSanJuan2 = new Votante(sanJuan);
        Votante votanteSanJuan3 = new Votante(sanJuan);
        Votante votanteSanJuan4 = new Votante(sanJuan);
        Votante votanteSanJuan5 = new Votante(sanJuan);

        Votante votanteSanLuis1 = new Votante(sanLuis);
        Votante votanteSanLuis2 = new Votante(sanLuis);
        Votante votanteSanLuis3 = new Votante(sanLuis);
        Votante votanteSanLuis4 = new Votante(sanLuis);
        Votante votanteSanLuis5 = new Votante(sanLuis);

        Votante votanteSantaCruz1 = new Votante(santaCruz);
        Votante votanteSantaCruz2 = new Votante(santaCruz);
        Votante votanteSantaCruz3 = new Votante(santaCruz);
        Votante votanteSantaCruz4 = new Votante(santaCruz);
        Votante votanteSantaCruz5 = new Votante(santaCruz);

        Votante votanteSantaFe1 = new Votante(santaFe);
        Votante votanteSantaFe2 = new Votante(santaFe);
        Votante votanteSantaFe3 = new Votante(santaFe);
        Votante votanteSantaFe4 = new Votante(santaFe);
        Votante votanteSantaFe5 = new Votante(santaFe);

        Votante votanteSantiagoDelEstero1 = new Votante(santiagoDelEstero);
        Votante votanteSantiagoDelEstero2 = new Votante(santiagoDelEstero);
        Votante votanteSantiagoDelEstero3 = new Votante(santiagoDelEstero);
        Votante votanteSantiagoDelEstero4 = new Votante(santiagoDelEstero);
        Votante votanteSantiagoDelEstero5 = new Votante(santiagoDelEstero);

        Votante votanteTierraDelFuego1 = new Votante(tierraDelFuego);
        Votante votanteTierraDelFuego2 = new Votante(tierraDelFuego);
        Votante votanteTierraDelFuego3 = new Votante(tierraDelFuego);
        Votante votanteTierraDelFuego4 = new Votante(tierraDelFuego);
        Votante votanteTierraDelFuego5 = new Votante(tierraDelFuego);

        Votante votanteTucuman1 = new Votante(tucuman);
        Votante votanteTucuman2 = new Votante(tucuman);
        Votante votanteTucuman3 = new Votante(tucuman);
        Votante votanteTucuman4 = new Votante(tucuman);
        Votante votanteTucuman5 = new Votante(tucuman);

        Partido socialista = new Partido();
        Partido comunista = new Partido();
        Partido radicalista = new Partido();
        Partido democrata = new Partido();
        Partido republicano = new Partido();

        Candidato candidatoSocialistaDeCatamarca1 = new Candidato(1, socialista, catamarca);
        Candidato candidatoComunistaDeCatamarca2 = new Candidato(2, comunista, catamarca);
        Candidato candidatoRadicalistaDeCatamarca3 = new Candidato(3, radicalista, catamarca);
        Candidato candidatoDemocrataDeCatamarca4 = new Candidato(4, democrata, catamarca);
        Candidato candidatoRepublicanoDeCatamarca5 = new Candidato(5, republicano, catamarca);
        Candidato otroCandidatoSocialistaDeCatamarca6 = new Candidato(6, socialista, catamarca);

        Candidato candidatoSocialistaDeChaco1 = new Candidato(7, socialista, chaco);
        Candidato candidatoComunistaDeChaco2 = new Candidato(8, comunista, chaco);
        Candidato candidatoRadicalistaDeChaco3 = new Candidato(9, radicalista, chaco);
        Candidato candidatoDemocrataDeChaco4 = new Candidato(10, democrata, chaco);
        Candidato candidatoRepublicanoDeChaco5 = new Candidato(11, republicano, chaco);
        Candidato otroCandidatoSocialistaDeChaco6 = new Candidato(12, socialista, chaco);

        Candidato candidatoSocialistaDeChubut1 = new Candidato(13, socialista, chubut);
        Candidato candidatoComunistaDeChubut2 = new Candidato(14, comunista, chubut);
        Candidato candidatoRadicalistaDeChubut3 = new Candidato(15, radicalista, chubut);
        Candidato candidatoDemocrataDeChubut4 = new Candidato(16, democrata, chubut);
        Candidato candidatoRepublicanoDeChubut5 = new Candidato(17, republicano, chubut);
        Candidato otroCandidatoSocialistaDeChubut6 = new Candidato(18, socialista, chubut);

        Candidato candidatoSocialistaDeCordoba1 = new Candidato(19, socialista, cordoba);
        Candidato candidatoComunistaDeCordoba2 = new Candidato(20, comunista, cordoba);
        Candidato candidatoRadicalistaDeCordoba3 = new Candidato(21, radicalista, cordoba);
        Candidato candidatoDemocrataDeCordoba4 = new Candidato(22, democrata, cordoba);
        Candidato candidatoRepublicanoDeCordoba5 = new Candidato(23, republicano, cordoba);
        Candidato otroCandidatoSocialistaDeCordoba6 = new Candidato(24, socialista, cordoba);

        Candidato candidatoSocialistaDeCorrientes1 = new Candidato(25, socialista, corrientes);
        Candidato candidatoComunistaDeCorrientes2 = new Candidato(26, comunista, corrientes);
        Candidato candidatoRadicalistaDeCorrientes3 = new Candidato(27, radicalista, corrientes);
        Candidato candidatoDemocrataDeCorrientes4 = new Candidato(28, democrata, corrientes);
        Candidato candidatoRepublicanoDeCorrientes5 = new Candidato(29, republicano, corrientes);
        Candidato otroCandidatoSocialistaDeCorrientes6 = new Candidato(30, socialista, corrientes);

        Candidato candidatoSocialistaDeEntreRios1 = new Candidato(31, socialista, entreRios);
        Candidato candidatoComunistaDeEntreRios2 = new Candidato(32, comunista, entreRios);
        Candidato candidatoRadicalistaDeEntreRios3 = new Candidato(33, radicalista, entreRios);
        Candidato candidatoDemocrataDeEntreRios4 = new Candidato(34, democrata, entreRios);
        Candidato candidatoRepublicanoDeEntreRios5 = new Candidato(35, republicano, entreRios);
        Candidato otroCandidatoSocialistaDeEntreRios6 = new Candidato(36, socialista, entreRios);

        Candidato candidatoSocialistaDeFormosa1 = new Candidato(37, socialista, formosa);
        Candidato candidatoComunistaDeFormosa2 = new Candidato(38, comunista, formosa);
        Candidato candidatoRadicalistaDeFormosa3 = new Candidato(39, radicalista, formosa);
        Candidato candidatoDemocrataDeFormosa4 = new Candidato(40, democrata, formosa);
        Candidato candidatoRepublicanoDeFormosa5 = new Candidato(41, republicano, formosa);
        Candidato otroCandidatoSocialistaDeFormosa6 = new Candidato(42, socialista, formosa);

        Candidato candidatoSocialistaDeJujuy1 = new Candidato(43, socialista, jujuy);
        Candidato candidatoComunistaDeJujuy2 = new Candidato(44, comunista, jujuy);
        Candidato candidatoRadicalistaDeJujuy3 = new Candidato(45, radicalista, jujuy);
        Candidato candidatoDemocrataDeJujuy4 = new Candidato(46, democrata, jujuy);
        Candidato candidatoRepublicanoDeJujuy5 = new Candidato(47, republicano, jujuy);
        Candidato otroCandidatoSocialistaDeJujuy6 = new Candidato(48, socialista, jujuy);

        Candidato candidatoSocialistaDeLaPampa1 = new Candidato(49, socialista, laPampa);
        Candidato candidatoComunistaDeLaPampa2 = new Candidato(50, comunista, laPampa);
        Candidato candidatoRadicalistaDeLaPampa3 = new Candidato(51, radicalista, laPampa);
        Candidato candidatoDemocrataDeLaPampa4 = new Candidato(52, democrata, laPampa);
        Candidato candidatoRepublicanoDeLaPampa5 = new Candidato(53, republicano, laPampa);
        Candidato otroCandidatoSocialistaDeLaPampa6 = new Candidato(54, socialista, laPampa);

        Candidato candidatoSocialistaDeLaRioja1 = new Candidato(55, socialista, laRioja);
        Candidato candidatoComunistaDeLaRioja2 = new Candidato(56, comunista, laRioja);
        Candidato candidatoRadicalistaDeLaRioja3 = new Candidato(57, radicalista, laRioja);
        Candidato candidatoDemocrataDeLaRioja4 = new Candidato(58, democrata, laRioja);
        Candidato candidatoRepublicanoDeLaRioja5 = new Candidato(59, republicano, laRioja);
        Candidato otroCandidatoSocialistaDeLaRioja6 = new Candidato(60, socialista, laRioja);

        Candidato candidatoSocialistaDeMendoza1 = new Candidato(61, socialista, mendoza);
        Candidato candidatoComunistaDeMendoza2 = new Candidato(62, comunista, mendoza);
        Candidato candidatoRadicalistaDeMendoza3 = new Candidato(63, radicalista, mendoza);
        Candidato candidatoDemocrataDeMendoza4 = new Candidato(64, democrata, mendoza);
        Candidato candidatoRepublicanoDeMendoza5 = new Candidato(65, republicano, mendoza);
        Candidato otroCandidatoSocialistaDeMendoza6 = new Candidato(66, socialista, mendoza);

        Candidato candidatoSocialistaDeMisiones1 = new Candidato(67, socialista, misiones);
        Candidato candidatoComunistaDeMisiones2 = new Candidato(68, comunista, misiones);
        Candidato candidatoRadicalistaDeMisiones3 = new Candidato(69, radicalista, misiones);
        Candidato candidatoDemocrataDeMisiones4 = new Candidato(70, democrata, misiones);
        Candidato candidatoRepublicanoDeMisiones5 = new Candidato(71, republicano, misiones);
        Candidato otroCandidatoSocialistaDeMisiones6 = new Candidato(72, socialista, misiones);

        Candidato candidatoSocialistaDeNeuquen1 = new Candidato(73, socialista, neuquen);
        Candidato candidatoComunistaDeNeuquen2 = new Candidato(74, comunista, neuquen);
        Candidato candidatoRadicalistaDeNeuquen3 = new Candidato(75, radicalista, neuquen);
        Candidato candidatoDemocrataDeNeuquen4 = new Candidato(76, democrata, neuquen);
        Candidato candidatoRepublicanoDeNeuquen5 = new Candidato(77, republicano, neuquen);
        Candidato otroCandidatoSocialistaDeNeuquen6 = new Candidato(78, socialista, neuquen);

        Candidato candidatoSocialistaDeRioNegro1 = new Candidato(79, socialista, rioNegro);
        Candidato candidatoComunistaDeRioNegro2 = new Candidato(80, comunista, rioNegro);
        Candidato candidatoRadicalistaDeRioNegro3 = new Candidato(81, radicalista, rioNegro);
        Candidato candidatoDemocrataDeRioNegro4 = new Candidato(82, democrata, rioNegro);
        Candidato candidatoRepublicanoDeRioNegro5 = new Candidato(83, republicano, rioNegro);
        Candidato otroCandidatoSocialistaDeRioNegro6 = new Candidato(84, socialista, rioNegro);

        Candidato candidatoSocialistaDeSalta1 = new Candidato(85, socialista, salta);
        Candidato candidatoComunistaDeSalta2 = new Candidato(86, comunista, salta);
        Candidato candidatoRadicalistaDeSalta3 = new Candidato(87, radicalista, salta);
        Candidato candidatoDemocrataDeSalta4 = new Candidato(88, democrata, salta);
        Candidato candidatoRepublicanoDeSalta5 = new Candidato(89, republicano, salta);
        Candidato otroCandidatoSocialistaDeSalta6 = new Candidato(90, socialista, salta);

        Candidato candidatoSocialistaDeSanJuan1 = new Candidato(91, socialista, sanJuan);
        Candidato candidatoComunistaDeSanJuan2 = new Candidato(92, comunista, sanJuan);
        Candidato candidatoRadicalistaDeSanJuan3 = new Candidato(93, radicalista, sanJuan);
        Candidato candidatoDemocrataDeSanJuan4 = new Candidato(94, democrata, sanJuan);
        Candidato candidatoRepublicanoDeSanJuan5 = new Candidato(95, republicano, sanJuan);
        Candidato otroCandidatoSocialistaDeSanJuan6 = new Candidato(96, socialista, sanJuan);

        Candidato candidatoSocialistaDeSanLuis1 = new Candidato(97, socialista, sanLuis);
        Candidato candidatoComunistaDeSanLuis2 = new Candidato(98, comunista, sanLuis);
        Candidato candidatoRadicalistaDeSanLuis3 = new Candidato(99, radicalista, sanLuis);
        Candidato candidatoDemocrataDeSanLuis4 = new Candidato(100, democrata, sanLuis);
        Candidato candidatoRepublicanoDeSanLuis5 = new Candidato(101, republicano, sanLuis);
        Candidato otroCandidatoSocialistaDeSanLuis6 = new Candidato(102, socialista, sanLuis);

        Candidato candidatoSocialistaDeSantaCruz1 = new Candidato(103, socialista, santaCruz);
        Candidato candidatoComunistaDeSantaCruz2 = new Candidato(104, comunista, santaCruz);
        Candidato candidatoRadicalistaDeSantaCruz3 = new Candidato(105, radicalista, santaCruz);
        Candidato candidatoDemocrataDeSantaCruz4 = new Candidato(106, democrata, santaCruz);
        Candidato candidatoRepublicanoDeSantaCruz5 = new Candidato(107, republicano, santaCruz);
        Candidato otroCandidatoSocialistaDeSantaCruz6 = new Candidato(108, socialista, santaCruz);

        Candidato candidatoSocialistaDeSantaFe1 = new Candidato(109, socialista, santaFe);
        Candidato candidatoComunistaDeSantaFe2 = new Candidato(110, comunista, santaFe);
        Candidato candidatoRadicalistaDeSantaFe3 = new Candidato(111, radicalista, santaFe);
        Candidato candidatoDemocrataDeSantaFe4 = new Candidato(112, democrata, santaFe);
        Candidato candidatoRepublicanoDeSantaFe5 = new Candidato(113, republicano, santaFe);
        Candidato otroCandidatoSocialistaDeSantaFe6 = new Candidato(114, socialista, santaFe);

        Candidato candidatoSocialistaDeSantiagoDelEstero1 = new Candidato(115, socialista, santiagoDelEstero);
        Candidato candidatoComunistaDeSantiagoDelEstero2 = new Candidato(116, comunista, santiagoDelEstero);
        Candidato candidatoRadicalistaDeSantiagoDelEstero3 = new Candidato(117, radicalista, santiagoDelEstero);
        Candidato candidatoDemocrataDeSantiagoDelEstero4 = new Candidato(118, democrata, santiagoDelEstero);
        Candidato candidatoRepublicanoDeSantiagoDelEstero5 = new Candidato(119, republicano, santiagoDelEstero);
        Candidato otroCandidatoSocialistaDeSantiagoDelEstero6 = new Candidato(120, socialista, santiagoDelEstero);

        Candidato candidatoSocialistaDeTierraDelFuego1 = new Candidato(121, socialista, tierraDelFuego);
        Candidato candidatoComunistaDeTierraDelFuego2 = new Candidato(122, comunista, tierraDelFuego);
        Candidato candidatoRadicalistaDeTierraDelFuego3 = new Candidato(123, radicalista, tierraDelFuego);
        Candidato candidatoDemocrataDeTierraDelFuego4 = new Candidato(124, democrata, tierraDelFuego);
        Candidato candidatoRepublicanoDeTierraDelFuego5 = new Candidato(125, republicano, tierraDelFuego);
        Candidato otroCandidatoSocialistaDeTierraDelFuego6 = new Candidato(126, socialista, tierraDelFuego);

        Candidato candidatoSocialistaDeTucuman1 = new Candidato(127, socialista, tucuman);
        Candidato candidatoComunistaDeTucuman2 = new Candidato(128, comunista, tucuman);
        Candidato candidatoRadicalistaDeTucuman3 = new Candidato(129, radicalista, tucuman);
        Candidato candidatoDemocrataDeTucuman4 = new Candidato(130, democrata, tucuman);
        Candidato candidatoRepublicanoDeTucuman5 = new Candidato(131, republicano, tucuman);
        Candidato otroCandidatoSocialistaDeTucuman6 = new Candidato(132, socialista, tucuman);

        Candidato candidatoSocialistaDeBuenosAires1 = new Candidato(133, socialista, buenosAires);
        Candidato candidatoComunistaDeBuenosAires2 = new Candidato(134, comunista, buenosAires);
        Candidato candidatoRadicalistaDeBuenosAires3 = new Candidato(135, radicalista, buenosAires);
        Candidato candidatoDemocrataDeBuenosAires4 = new Candidato(136, democrata, buenosAires);
        Candidato candidatoRepublicanoDeBuenosAires5 = new Candidato(137, republicano, buenosAires);
        Candidato otroCandidatoSocialistaDeBuenosAires6 = new Candidato(138, socialista, buenosAires);

        Candidato candidatoSocialistaDeCABA1 = new Candidato(139, socialista, caba);
        Candidato candidatoComunistaDeCABA2 = new Candidato(140, comunista, caba);
        Candidato candidatoRadicalistaDeCABA3 = new Candidato(141, radicalista, caba);
        Candidato candidatoDemocrataDeCABA4 = new Candidato(142, democrata, caba);
        Candidato candidatoRepublicanoDeCABA5 = new Candidato(143, republicano, caba);
        Candidato otroCandidatoSocialistaDeCABA6 = new Candidato(144, socialista, caba);

        socialista.setCandidato(candidatoSocialistaDeBuenosAires1);
        socialista.setCandidato(candidatoSocialistaDeCABA1);
        socialista.setCandidato(candidatoSocialistaDeCatamarca1);
        socialista.setCandidato(candidatoSocialistaDeChaco1);
        socialista.setCandidato(candidatoSocialistaDeChubut1);
        socialista.setCandidato(candidatoSocialistaDeCordoba1);
        socialista.setCandidato(candidatoSocialistaDeCorrientes1);
        socialista.setCandidato(candidatoSocialistaDeEntreRios1);
        socialista.setCandidato(candidatoSocialistaDeFormosa1);
        socialista.setCandidato(candidatoSocialistaDeJujuy1);
        socialista.setCandidato(candidatoSocialistaDeLaPampa1);
        socialista.setCandidato(candidatoSocialistaDeLaRioja1);
        socialista.setCandidato(candidatoSocialistaDeMendoza1);
        socialista.setCandidato(candidatoSocialistaDeMisiones1);
        socialista.setCandidato(candidatoSocialistaDeNeuquen1);
        socialista.setCandidato(candidatoSocialistaDeRioNegro1);
        socialista.setCandidato(candidatoSocialistaDeSalta1);
        socialista.setCandidato(candidatoSocialistaDeSanJuan1);
        socialista.setCandidato(candidatoSocialistaDeSanLuis1);
        socialista.setCandidato(candidatoSocialistaDeSantaCruz1);
        socialista.setCandidato(candidatoSocialistaDeSantaFe1);
        socialista.setCandidato(candidatoSocialistaDeSantiagoDelEstero1);
        socialista.setCandidato(candidatoSocialistaDeTierraDelFuego1);
        socialista.setCandidato(candidatoSocialistaDeTucuman1);
        socialista.setCandidato(otroCandidatoSocialistaDeBuenosAires6);
        socialista.setCandidato(otroCandidatoSocialistaDeCABA6);
        socialista.setCandidato(otroCandidatoSocialistaDeCatamarca6);
        socialista.setCandidato(otroCandidatoSocialistaDeChaco6);
        socialista.setCandidato(otroCandidatoSocialistaDeChubut6);
        socialista.setCandidato(otroCandidatoSocialistaDeCordoba6);
        socialista.setCandidato(otroCandidatoSocialistaDeCorrientes6);
        socialista.setCandidato(otroCandidatoSocialistaDeEntreRios6);
        socialista.setCandidato(otroCandidatoSocialistaDeFormosa6);
        socialista.setCandidato(otroCandidatoSocialistaDeJujuy6);
        socialista.setCandidato(otroCandidatoSocialistaDeLaPampa6);
        socialista.setCandidato(otroCandidatoSocialistaDeLaRioja6);
        socialista.setCandidato(otroCandidatoSocialistaDeMendoza6);
        socialista.setCandidato(otroCandidatoSocialistaDeMisiones6);
        socialista.setCandidato(otroCandidatoSocialistaDeNeuquen6);
        socialista.setCandidato(otroCandidatoSocialistaDeRioNegro6);
        socialista.setCandidato(otroCandidatoSocialistaDeSalta6);
        socialista.setCandidato(otroCandidatoSocialistaDeSanJuan6);
        socialista.setCandidato(otroCandidatoSocialistaDeSanLuis6);
        socialista.setCandidato(otroCandidatoSocialistaDeSantaCruz6);
        socialista.setCandidato(otroCandidatoSocialistaDeSantaFe6);
        socialista.setCandidato(otroCandidatoSocialistaDeSantiagoDelEstero6);
        socialista.setCandidato(otroCandidatoSocialistaDeTierraDelFuego6);
        socialista.setCandidato(otroCandidatoSocialistaDeTucuman6);

        comunista.setCandidato(candidatoComunistaDeBuenosAires2);
        comunista.setCandidato(candidatoComunistaDeCABA2);
        comunista.setCandidato(candidatoComunistaDeCatamarca2);
        comunista.setCandidato(candidatoComunistaDeChaco2);
        comunista.setCandidato(candidatoComunistaDeChubut2);
        comunista.setCandidato(candidatoComunistaDeCordoba2);
        comunista.setCandidato(candidatoComunistaDeCorrientes2);
        comunista.setCandidato(candidatoComunistaDeEntreRios2);
        comunista.setCandidato(candidatoComunistaDeFormosa2);
        comunista.setCandidato(candidatoComunistaDeJujuy2);
        comunista.setCandidato(candidatoComunistaDeLaPampa2);
        comunista.setCandidato(candidatoComunistaDeLaRioja2);
        comunista.setCandidato(candidatoComunistaDeMendoza2);
        comunista.setCandidato(candidatoComunistaDeMisiones2);
        comunista.setCandidato(candidatoComunistaDeNeuquen2);
        comunista.setCandidato(candidatoComunistaDeRioNegro2);
        comunista.setCandidato(candidatoComunistaDeSalta2);
        comunista.setCandidato(candidatoComunistaDeSanJuan2);
        comunista.setCandidato(candidatoComunistaDeSanLuis2);
        comunista.setCandidato(candidatoComunistaDeSantaCruz2);
        comunista.setCandidato(candidatoComunistaDeSantaFe2);
        comunista.setCandidato(candidatoComunistaDeSantiagoDelEstero2);
        comunista.setCandidato(candidatoComunistaDeTierraDelFuego2);
        comunista.setCandidato(candidatoComunistaDeTucuman2);

        radicalista.setCandidato(candidatoRadicalistaDeBuenosAires3);
        radicalista.setCandidato(candidatoRadicalistaDeCABA3);
        radicalista.setCandidato(candidatoRadicalistaDeCatamarca3);
        radicalista.setCandidato(candidatoRadicalistaDeChaco3);
        radicalista.setCandidato(candidatoRadicalistaDeChubut3);
        radicalista.setCandidato(candidatoRadicalistaDeCordoba3);
        radicalista.setCandidato(candidatoRadicalistaDeCorrientes3);
        radicalista.setCandidato(candidatoRadicalistaDeEntreRios3);
        radicalista.setCandidato(candidatoRadicalistaDeFormosa3);
        radicalista.setCandidato(candidatoRadicalistaDeJujuy3);
        radicalista.setCandidato(candidatoRadicalistaDeLaPampa3);
        radicalista.setCandidato(candidatoRadicalistaDeLaRioja3);
        radicalista.setCandidato(candidatoRadicalistaDeMendoza3);
        radicalista.setCandidato(candidatoRadicalistaDeMisiones3);
        radicalista.setCandidato(candidatoRadicalistaDeNeuquen3);
        radicalista.setCandidato(candidatoRadicalistaDeRioNegro3);
        radicalista.setCandidato(candidatoRadicalistaDeSalta3);
        radicalista.setCandidato(candidatoRadicalistaDeSanJuan3);
        radicalista.setCandidato(candidatoRadicalistaDeSanLuis3);
        radicalista.setCandidato(candidatoRadicalistaDeSantaCruz3);
        radicalista.setCandidato(candidatoRadicalistaDeSantaFe3);
        radicalista.setCandidato(candidatoRadicalistaDeSantiagoDelEstero3);
        radicalista.setCandidato(candidatoRadicalistaDeTierraDelFuego3);
        radicalista.setCandidato(candidatoRadicalistaDeTucuman3);

        democrata.setCandidato(candidatoDemocrataDeBuenosAires4);
        democrata.setCandidato(candidatoDemocrataDeCABA4);
        democrata.setCandidato(candidatoDemocrataDeCatamarca4);
        democrata.setCandidato(candidatoDemocrataDeChaco4);
        democrata.setCandidato(candidatoDemocrataDeChubut4);
        democrata.setCandidato(candidatoDemocrataDeCordoba4);
        democrata.setCandidato(candidatoDemocrataDeCorrientes4);
        democrata.setCandidato(candidatoDemocrataDeEntreRios4);
        democrata.setCandidato(candidatoDemocrataDeFormosa4);
        democrata.setCandidato(candidatoDemocrataDeJujuy4);
        democrata.setCandidato(candidatoDemocrataDeLaPampa4);
        democrata.setCandidato(candidatoDemocrataDeLaRioja4);
        democrata.setCandidato(candidatoDemocrataDeMendoza4);
        democrata.setCandidato(candidatoDemocrataDeMisiones4);
        democrata.setCandidato(candidatoDemocrataDeNeuquen4);
        democrata.setCandidato(candidatoDemocrataDeRioNegro4);
        democrata.setCandidato(candidatoDemocrataDeSalta4);
        democrata.setCandidato(candidatoDemocrataDeSanJuan4);
        democrata.setCandidato(candidatoDemocrataDeSanLuis4);
        democrata.setCandidato(candidatoDemocrataDeSantaCruz4);
        democrata.setCandidato(candidatoDemocrataDeSantaFe4);
        democrata.setCandidato(candidatoDemocrataDeSantiagoDelEstero4);
        democrata.setCandidato(candidatoDemocrataDeTierraDelFuego4);
        democrata.setCandidato(candidatoDemocrataDeTucuman4);

        republicano.setCandidato(candidatoRepublicanoDeBuenosAires5);
        republicano.setCandidato(candidatoRepublicanoDeCABA5);
        republicano.setCandidato(candidatoRepublicanoDeCatamarca5);
        republicano.setCandidato(candidatoRepublicanoDeChaco5);
        republicano.setCandidato(candidatoRepublicanoDeChubut5);
        republicano.setCandidato(candidatoRepublicanoDeCordoba5);
        republicano.setCandidato(candidatoRepublicanoDeCorrientes5);
        republicano.setCandidato(candidatoRepublicanoDeEntreRios5);
        republicano.setCandidato(candidatoRepublicanoDeFormosa5);
        republicano.setCandidato(candidatoRepublicanoDeJujuy5);
        republicano.setCandidato(candidatoRepublicanoDeLaPampa5);
        republicano.setCandidato(candidatoRepublicanoDeLaRioja5);
        republicano.setCandidato(candidatoRepublicanoDeMendoza5);
        republicano.setCandidato(candidatoRepublicanoDeMisiones5);
        republicano.setCandidato(candidatoRepublicanoDeNeuquen5);
        republicano.setCandidato(candidatoRepublicanoDeRioNegro5);
        republicano.setCandidato(candidatoRepublicanoDeSalta5);
        republicano.setCandidato(candidatoRepublicanoDeSanJuan5);
        republicano.setCandidato(candidatoRepublicanoDeSanLuis5);
        republicano.setCandidato(candidatoRepublicanoDeSantaCruz5);
        republicano.setCandidato(candidatoRepublicanoDeSantaFe5);
        republicano.setCandidato(candidatoRepublicanoDeSantiagoDelEstero5);
        republicano.setCandidato(candidatoRepublicanoDeTierraDelFuego5);
        republicano.setCandidato(candidatoRepublicanoDeTucuman5);

        votanteBuenosAires1.votar(socialista.getCandidato(candidatoSocialistaDeBuenosAires1));
        votanteBuenosAires2.votar(comunista.getCandidato(candidatoComunistaDeBuenosAires2));
        votanteBuenosAires3.votar(republicano.getCandidato(candidatoRepublicanoDeBuenosAires5));
        votanteBuenosAires4.votar(socialista.getCandidato(otroCandidatoSocialistaDeBuenosAires6));
        votanteBuenosAires5.votar(socialista.getCandidato(otroCandidatoSocialistaDeBuenosAires6));
        Candidato ganadorBuenosAires = socialista.getCandidato(otroCandidatoSocialistaDeBuenosAires6);

        votanteCaba1.votar(socialista.getCandidato(candidatoSocialistaDeCABA1));
        votanteCaba2.votar(socialista.getCandidato(candidatoSocialistaDeCABA1));
        votanteCaba3.votar(socialista.getCandidato(otroCandidatoSocialistaDeCABA6));
        votanteCaba4.votar(democrata.getCandidato(candidatoDemocrataDeCABA4));
        votanteCaba5.votar(socialista.getCandidato(candidatoSocialistaDeCABA1));
        Candidato ganadorCABA = socialista.getCandidato(candidatoSocialistaDeCABA1);

        votanteCatamarca1.votar(socialista.getCandidato(candidatoSocialistaDeCatamarca1));
        votanteCatamarca2.votar(republicano.getCandidato(candidatoRepublicanoDeCatamarca5));
        votanteCatamarca3.votar(republicano.getCandidato(candidatoRepublicanoDeCatamarca5));
        votanteCatamarca4.votar(republicano.getCandidato(candidatoRepublicanoDeCatamarca5));
        votanteCatamarca5.votar(democrata.getCandidato(candidatoDemocrataDeCatamarca4));
        Candidato ganadorCatamarca = republicano.getCandidato(candidatoRepublicanoDeCatamarca5);

        votanteChaco1.votar(comunista.getCandidato(candidatoComunistaDeChaco2));
        votanteChaco2.votar(comunista.getCandidato(candidatoComunistaDeChaco2));
        votanteChaco3.votar(comunista.getCandidato(candidatoComunistaDeChaco2));
        votanteChaco4.votar(comunista.getCandidato(candidatoComunistaDeChaco2));
        votanteChaco5.votar(socialista.getCandidato(otroCandidatoSocialistaDeChaco6));
        Candidato ganadorChacho = comunista.getCandidato(candidatoComunistaDeChaco2);

        votanteChubut1.votar(democrata.getCandidato(candidatoDemocrataDeChubut4));
        votanteChubut2.votar(democrata.getCandidato(candidatoDemocrataDeChubut4));
        votanteChubut3.votar(radicalista.getCandidato(candidatoRadicalistaDeChubut3));
        votanteChubut4.votar(democrata.getCandidato(candidatoDemocrataDeChubut4));
        votanteChubut5.votar(radicalista.getCandidato(candidatoRadicalistaDeChubut3));
        Candidato ganadorChubut = democrata.getCandidato(candidatoDemocrataDeChubut4);

        votanteCordoba1.votar(republicano.getCandidato(candidatoRepublicanoDeCordoba5));
        votanteCordoba2.votar(democrata.getCandidato(candidatoDemocrataDeCordoba4));
        votanteCordoba3.votar(socialista.getCandidato(otroCandidatoSocialistaDeCordoba6));
        votanteCordoba4.votar(republicano.getCandidato(candidatoRepublicanoDeCordoba5));
        votanteCordoba5.votar(socialista.getCandidato(candidatoSocialistaDeCordoba1));
        Candidato ganadorCordoba = republicano.getCandidato(candidatoRepublicanoDeCordoba5);

        votanteCorrientes1.votar(radicalista.getCandidato(candidatoRadicalistaDeCorrientes3));
        votanteCorrientes2.votar(radicalista.getCandidato(candidatoRadicalistaDeCorrientes3));
        votanteCorrientes3.votar(radicalista.getCandidato(candidatoRadicalistaDeCorrientes3));
        votanteCorrientes4.votar(democrata.getCandidato(candidatoDemocrataDeCorrientes4));
        votanteCorrientes5.votar(republicano.getCandidato(candidatoRepublicanoDeCorrientes5));
        Candidato ganadorCorrientes = radicalista.getCandidato(candidatoRadicalistaDeCorrientes3);

        votanteEentreRios1.votar(socialista.getCandidato(candidatoSocialistaDeEntreRios1));
        votanteEentreRios2.votar(socialista.getCandidato(candidatoSocialistaDeEntreRios1));
        votanteEentreRios3.votar(socialista.getCandidato(candidatoSocialistaDeEntreRios1));
        votanteEentreRios4.votar(socialista.getCandidato(candidatoSocialistaDeEntreRios1));
        votanteEentreRios5.votar(socialista.getCandidato(candidatoSocialistaDeEntreRios1));
        Candidato ganadorEntreRios = socialista.getCandidato(candidatoSocialistaDeEntreRios1);

        votanteFormosa1.votar(socialista.getCandidato(otroCandidatoSocialistaDeFormosa6));
        votanteFormosa2.votar(socialista.getCandidato(otroCandidatoSocialistaDeFormosa6));
        votanteFormosa3.votar(socialista.getCandidato(otroCandidatoSocialistaDeFormosa6));
        votanteFormosa4.votar(socialista.getCandidato(otroCandidatoSocialistaDeFormosa6));
        votanteFormosa5.votar(socialista.getCandidato(otroCandidatoSocialistaDeFormosa6));
        Candidato ganadorFormosa = socialista.getCandidato(otroCandidatoSocialistaDeFormosa6);

        votanteJujuy1.votar(socialista.getCandidato(candidatoSocialistaDeJujuy1));
        votanteJujuy2.votar(socialista.getCandidato(candidatoSocialistaDeJujuy1));
        votanteJujuy3.votar(socialista.getCandidato(candidatoSocialistaDeJujuy1));
        votanteJujuy4.votar(socialista.getCandidato(candidatoSocialistaDeJujuy1));
        votanteJujuy5.votar(socialista.getCandidato(otroCandidatoSocialistaDeJujuy6));
        Candidato ganadorJujuy = socialista.getCandidato(candidatoSocialistaDeJujuy1);

        votanteLaPampa1.votar(socialista.getCandidato(candidatoSocialistaDeLaPampa1));
        votanteLaPampa2.votar(socialista.getCandidato(candidatoSocialistaDeLaPampa1));
        votanteLaPampa3.votar(socialista.getCandidato(candidatoSocialistaDeLaPampa1));
        votanteLaPampa4.votar(socialista.getCandidato(candidatoSocialistaDeLaPampa1));
        votanteLaPampa5.votar(socialista.getCandidato(candidatoSocialistaDeLaPampa1));
        Candidato ganadorLaPampa = socialista.getCandidato(candidatoSocialistaDeLaPampa1);

        votanteLaRioja1.votar(socialista.getCandidato(candidatoSocialistaDeLaRioja1));
        votanteLaRioja2.votar(socialista.getCandidato(candidatoSocialistaDeLaRioja1));
        votanteLaRioja3.votar(socialista.getCandidato(candidatoSocialistaDeLaRioja1));
        votanteLaRioja4.votar(socialista.getCandidato(candidatoSocialistaDeLaRioja1));
        votanteLaRioja5.votar(socialista.getCandidato(candidatoSocialistaDeLaRioja1));
        Candidato ganadorLaRioja = socialista.getCandidato(candidatoSocialistaDeLaRioja1);

        votanteMendoza1.votar(socialista.getCandidato(candidatoSocialistaDeMendoza1));
        votanteMendoza2.votar(socialista.getCandidato(candidatoSocialistaDeMendoza1));
        votanteMendoza3.votar(socialista.getCandidato(candidatoSocialistaDeMendoza1));
        votanteMendoza4.votar(socialista.getCandidato(candidatoSocialistaDeMendoza1));
        votanteMendoza5.votar(socialista.getCandidato(candidatoSocialistaDeMendoza1));
        Candidato ganadorMendoza = socialista.getCandidato(candidatoSocialistaDeMendoza1);

        votanteMisiones1.votar(socialista.getCandidato(otroCandidatoSocialistaDeMisiones6));
        votanteMisiones2.votar(socialista.getCandidato(otroCandidatoSocialistaDeMisiones6));
        votanteMisiones3.votar(socialista.getCandidato(otroCandidatoSocialistaDeMisiones6));
        votanteMisiones4.votar(socialista.getCandidato(otroCandidatoSocialistaDeMisiones6));
        votanteMisiones5.votar(socialista.getCandidato(otroCandidatoSocialistaDeMisiones6));
        Candidato ganadorMisiones = socialista.getCandidato(otroCandidatoSocialistaDeMisiones6);

        votanteNeuquen1.votar(socialista.getCandidato(candidatoSocialistaDeNeuquen1));
        votanteNeuquen2.votar(socialista.getCandidato(candidatoSocialistaDeNeuquen1));
        votanteNeuquen3.votar(socialista.getCandidato(candidatoSocialistaDeNeuquen1));
        votanteNeuquen4.votar(socialista.getCandidato(candidatoSocialistaDeNeuquen1));
        votanteNeuquen5.votar(socialista.getCandidato(candidatoSocialistaDeNeuquen1));
        Candidato ganadorNeuquen = socialista.getCandidato(candidatoSocialistaDeNeuquen1);

        votanteRioNegro1.votar(democrata.getCandidato(candidatoDemocrataDeRioNegro4));
        votanteRioNegro2.votar(democrata.getCandidato(candidatoDemocrataDeRioNegro4));
        votanteRioNegro3.votar(democrata.getCandidato(candidatoDemocrataDeRioNegro4));
        votanteRioNegro4.votar(democrata.getCandidato(candidatoDemocrataDeRioNegro4));
        votanteRioNegro5.votar(democrata.getCandidato(candidatoDemocrataDeRioNegro4));
        Candidato ganadorRioNegro = democrata.getCandidato(candidatoDemocrataDeRioNegro4);

        votanteSalta1.votar(republicano.getCandidato(candidatoRepublicanoDeSalta5));
        votanteSalta2.votar(republicano.getCandidato(candidatoRepublicanoDeSalta5));
        votanteSalta3.votar(republicano.getCandidato(candidatoRepublicanoDeSalta5));
        votanteSalta4.votar(republicano.getCandidato(candidatoRepublicanoDeSalta5));
        votanteSalta5.votar(democrata.getCandidato(candidatoDemocrataDeSalta4));
        Candidato ganadorSalta = republicano.getCandidato(candidatoRepublicanoDeSalta5);

        votanteSanJuan1.votar(socialista.getCandidato(candidatoSocialistaDeSanJuan1));
        votanteSanJuan2.votar(socialista.getCandidato(candidatoSocialistaDeSanJuan1));
        votanteSanJuan3.votar(socialista.getCandidato(candidatoSocialistaDeSanJuan1));
        votanteSanJuan4.votar(socialista.getCandidato(candidatoSocialistaDeSanJuan1));
        votanteSanJuan5.votar(socialista.getCandidato(candidatoSocialistaDeSanJuan1));
        Candidato ganadorSanJuan = socialista.getCandidato(candidatoSocialistaDeSanJuan1);

        votanteSanLuis1.votar(socialista.getCandidato(otroCandidatoSocialistaDeSanLuis6));
        votanteSanLuis2.votar(socialista.getCandidato(otroCandidatoSocialistaDeSanLuis6));
        votanteSanLuis3.votar(socialista.getCandidato(otroCandidatoSocialistaDeSanLuis6));
        votanteSanLuis4.votar(socialista.getCandidato(otroCandidatoSocialistaDeSanLuis6));
        votanteSanLuis5.votar(socialista.getCandidato(candidatoSocialistaDeSanLuis1));
        Candidato ganadorSanLuis = socialista.getCandidato(otroCandidatoSocialistaDeSanLuis6);

        votanteSantaCruz1.votar(socialista.getCandidato(otroCandidatoSocialistaDeSantaCruz6));
        votanteSantaCruz2.votar(socialista.getCandidato(otroCandidatoSocialistaDeSantaCruz6));
        votanteSantaCruz3.votar(socialista.getCandidato(otroCandidatoSocialistaDeSantaCruz6));
        votanteSantaCruz4.votar(socialista.getCandidato(otroCandidatoSocialistaDeSantaCruz6));
        votanteSantaCruz5.votar(socialista.getCandidato(otroCandidatoSocialistaDeSantaCruz6));
        Candidato ganadorSantaCruz = socialista.getCandidato(otroCandidatoSocialistaDeSantaCruz6);

        votanteSantaFe1.votar(comunista.getCandidato(candidatoComunistaDeSantaFe2));
        votanteSantaFe2.votar(comunista.getCandidato(candidatoComunistaDeSantaFe2));
        votanteSantaFe3.votar(comunista.getCandidato(candidatoComunistaDeSantaFe2));
        votanteSantaFe4.votar(comunista.getCandidato(candidatoComunistaDeSantaFe2));
        votanteSantaFe5.votar(comunista.getCandidato(candidatoComunistaDeSantaFe2));
        Candidato ganadorSantaFe = comunista.getCandidato(candidatoComunistaDeSantaFe2);

        votanteSantiagoDelEstero1.votar(democrata.getCandidato(candidatoDemocrataDeSantiagoDelEstero4));
        votanteSantiagoDelEstero2.votar(democrata.getCandidato(candidatoDemocrataDeSantiagoDelEstero4));
        votanteSantiagoDelEstero3.votar(democrata.getCandidato(candidatoDemocrataDeSantiagoDelEstero4));
        votanteSantiagoDelEstero4.votar(democrata.getCandidato(candidatoDemocrataDeSantiagoDelEstero4));
        votanteSantiagoDelEstero5.votar(democrata.getCandidato(candidatoDemocrataDeSantiagoDelEstero4));
        Candidato ganadorSantiagoDelEstero = democrata.getCandidato(candidatoDemocrataDeSantiagoDelEstero4);

        votanteTierraDelFuego1.votar(radicalista.getCandidato(candidatoRadicalistaDeTierraDelFuego3));
        votanteTierraDelFuego2.votar(radicalista.getCandidato(candidatoRadicalistaDeTierraDelFuego3));
        votanteTierraDelFuego3.votar(radicalista.getCandidato(candidatoRadicalistaDeTierraDelFuego3));
        votanteTierraDelFuego4.votar(radicalista.getCandidato(candidatoRadicalistaDeTierraDelFuego3));
        votanteTierraDelFuego5.votar(radicalista.getCandidato(candidatoRadicalistaDeTierraDelFuego3));
        Candidato ganadorTierraDelFuego = radicalista.getCandidato(candidatoRadicalistaDeTierraDelFuego3);

        votanteTucuman1.votar(radicalista.getCandidato(candidatoRadicalistaDeTucuman3));
        votanteTucuman2.votar(radicalista.getCandidato(candidatoRadicalistaDeTucuman3));
        votanteTucuman3.votar(radicalista.getCandidato(candidatoRadicalistaDeTucuman3));
        votanteTucuman4.votar(radicalista.getCandidato(candidatoRadicalistaDeTucuman3));
        votanteTucuman5.votar(radicalista.getCandidato(candidatoRadicalistaDeTucuman3));
        Candidato ganadorTucuman = radicalista.getCandidato(candidatoRadicalistaDeTucuman3);

        camaraElectoral.agregarPartido(socialista);
        camaraElectoral.agregarPartido(comunista);
        camaraElectoral.agregarPartido(radicalista);
        camaraElectoral.agregarPartido(democrata);
        camaraElectoral.agregarPartido(republicano);

        Assert.assertEquals(ganadorBuenosAires.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(buenosAires.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorCABA.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(caba.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorCatamarca.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(catamarca.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorChacho.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(chaco.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorChubut.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(chubut.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorCordoba.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(cordoba.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorCorrientes.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(corrientes.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorEntreRios.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(entreRios.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorFormosa.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(formosa.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorJujuy.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(jujuy.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorLaPampa.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(laPampa.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorLaRioja.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(laRioja.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorMendoza.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(mendoza.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorMisiones.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(misiones.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorNeuquen.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(neuquen.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorRioNegro.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(rioNegro.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorSalta.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(salta.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorSanJuan.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(sanJuan.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorSanLuis.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(sanLuis.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorSantaCruz.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(santaCruz.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorSantaFe.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(santaFe.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorSantiagoDelEstero.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(santiagoDelEstero.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorTierraDelFuego.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(tierraDelFuego.getNombre()).getIdCandidato());
        Assert.assertEquals(ganadorTucuman.getIdCandidato(), camaraElectoral.getGanadorEnCadaProvincia().get(tucuman.getNombre()).getIdCandidato());

    }
}
