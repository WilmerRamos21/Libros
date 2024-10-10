public class Main {
    public static void main(String[] args) {
        //Libros
        Libros libro1 = new Libros("La iliada","Homero", 1892, 450);
        Libros libro2 =new Libros("La Baldomera","Alfredo Pareja Diezcanseco", 1938, 250);
        Libros libro3 =new Libros("La Odisea","Homero", 1614, 392);
        Libros libro4 =new Libros("Nsrraciones Extraordinarias","Edgar Allan Poe", 1845, 410);
        Libros libro5 =new Libros("La metamorfosis","Franz Kafka", 1915, 400);

        System.out.println("------LIBROS------");
        libro1.imprimir();
        System.out.println("Numero de paginas con la cubierta es: "+libro1.imprimirCubierta());
        libro2.imprimir();
        System.out.println("Numero de paginas con la cubierta es: "+libro2.imprimirCubierta());
        libro3.imprimir();
        System.out.println("Numero de paginas con la cubierta es: "+libro3.imprimirCubierta());
        libro4.imprimir();
        System.out.println("Numero de paginas con la cubierta es: "+libro4.imprimirCubierta());
        libro5.imprimir();
        System.out.println("Numero de paginas con la cubierta es: "+libro5.imprimirCubierta());

        //Videojuegos

        Videojuegos videojuegos1 = new Videojuegos("Need For Spped","Carreras","PlayStation,Xbox,Pc,Moviles",2012);
        Videojuegos videojuegos2 = new Videojuegos("Resident Evil 4 Remake","Terror","PlayStation,Xbox,PC",2023);
        System.out.println("--------VIDEOJUEGOS---------");
        System.out.println("El nombre del videojuego es: "+videojuegos1.getNombre());
        System.out.println("EL genero del videojuego es: "+videojuegos1.getGenero());
        System.out.println("Disponible en las siguientes plataformas: "+videojuegos1.getPlataforma());
        System.out.println("Lanzado en el año: "+videojuegos1.getAnio_lanzamiento());
        System.out.println("-------------------");
        System.out.println("El nombre del videojuego es: "+videojuegos2.getNombre());
        System.out.println("El genero del videojuego es: "+videojuegos2.getGenero());
        System.out.println("Disponible en las siguientes plataformas: "+videojuegos2.getPlataforma());
        System.out.println("Lanzado en el año: "+videojuegos2.getAnio_lanzamiento());
        System.out.println("-------------------");


        //Autos
        Auto auto1 =new Auto("Porsche", "911 GT3 RS",372.80,2.3);
        Auto auto2 = new Auto("Koenigsegg","Regera", 455,1.5);
        System.out.println("-------AUTOS---------");
        System.out.println("La marca del auto es: "+ auto1.getMarca());
        System.out.println("El modelo del auto es: "+ auto1.getModelo());
        System.out.println("La velocidada maxima del auto en km/h es: "+auto1.getVelocidadMax());
        System.out.println("El tiempo de aceleracion del auto de 0 a 100 km/h es: "+auto1.getTiempoAceleracion()+" segundos");
        System.out.println("------------------");
        System.out.println("La marca del autos es: "+ auto2.getMarca());
        System.out.println("El modelo del auto es: "+ auto2.getModelo());
        System.out.println("La velocidada maxima del auto en km/h es: "+auto2.getVelocidadMax());
        System.out.println("El tiempo de aceleracion del auto de 0 a 100 km/h es: "+auto2.getTiempoAceleracion()+" segundos");
        System.out.println("-----------------");


        //Canciones
        Cancion cancion1 = new Cancion("Levels","Avicii",3.18,30,"Electronica");
        Cancion cancion2 = new Cancion("My Way","Calvin Harris",4.04,20,"Electronica");
        System.out.println("------CANCIONES-------");
        System.out.println("EL nombre del cancion es: "+ cancion1.getNombre());
        System.out.println("El artista de la cancion es: "+ cancion1.getArtista());
        System.out.println("El tiempo de duracion de la cancion es: "+cancion1.getDuracion());
        System.out.println("Visualizaciones en YouTube de: "+cancion1.getVisualizaciones()+" millones");
        System.out.println("El genero de la cancion es: "+cancion1.getGenero());
        System.out.println("--------------------");
        System.out.println("EL nombre del cancion es: "+ cancion2.getNombre());
        System.out.println("El artista de la cancion es: "+ cancion2.getArtista());
        System.out.println("El tiempo de duracion de la cancion es: "+cancion2.getDuracion());
        System.out.println("Visualizaciones en YouTube de: "+cancion2.getVisualizaciones()+" millones");
        System.out.println("El genero de la cancion es: "+cancion2.getGenero());
        System.out.println("--------------------");


        //Zapatos
        Zapatos zapato1 = new Zapatos("Venus", "Casual", "Negro",42, 32.5);
        Zapatos zapato2 = new Zapatos("Vans", "Deportivo", "Blanco y negro", 43,122.5);
        System.out.println("------ZAPATOS------");
        zapato1.Imprimir();
        zapato2.Imprimir();


        //Series
        Series serie1 = new Series("Hora de aventura","Adolescentes",240,2010);
        Series serie2 = new Series("Un show mas", "Adolescente",170,2014);
        System.out.println("------SERIES------");
        serie1.Impresion_serie();
        serie2.Impresion_serie();


        //Peliculas
        Peliculas peli1 =new Peliculas("Need for speed", "Scott Waugh", "Carreras",1.20, 2014);
        Peliculas peli2 = new Peliculas("Furia de Titanes", "Louis Leterrier", "Accion y aventura", 1.25, 2010);
        System.out.println("------PELICULAS------");
        peli1.Impresion_peliculas();
        peli2.Impresion_peliculas();


        //Materias
        Materia materia1 = new Materia("Programación orientada a objetos","Desarrollo de Software","Juan Pablo", 5);
        Materia materia2 = new Materia("Diseño de interfaces","Desarrollo de Software","Byron Loarte", 3);
        System.out.println("-------MATERIAS--------");
        materia1.Impresion_materias();
        materia2.Impresion_materias();


        //Instrumento Musical
        Instrumento_musical instrumento1 = new Instrumento_musical("Wilmer Ramos", "Guitarra", "Cuerda", 120, 2010);
        Instrumento_musical instrumento2 = new Instrumento_musical("Alberto Rojas", "Saxofón", "Viento", 200, 2017);
        System.out.println("------INSTRUMENTOS MUSICALES------");
        instrumento1.Impresion_instrumento();
        instrumento2.Impresion_instrumento();


        //Transportes
        Transporte transporte1 = new Transporte("Bicicleta", "Terrestre", 0, 10);
        Transporte transporte2 = new Transporte("Bus", "Terrestre", 0.35, 7);
        System.out.println("------TRANSPORTES------");
        transporte1.Impresion_transporte();
        transporte2.Impresion_transporte();


        //Persona
        Persona persona1 = new Persona("Mario Veléz",32,"Hombre", 1.72, 1234567890,"25/Marzo/1992");
        Persona persona2 = new Persona("Fernanda Sanchéz", 24, "Femenino", 1.63, 1987654321,"12/Febrero/2000");
        System.out.println("------PERSONAS------");
        persona1.impresion_datos_persona();
        persona2.impresion_datos_persona();
    }

}