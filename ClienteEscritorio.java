
import java.util.Scanner;

import java.util.*;
import org.me.servicioimagen.Image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumne
 */
public class ClienteEscritorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
             
        
        boolean sortir = false;
        while (!sortir) {
            System.out.println("1 - Registrar Imatge");
            System.out.println("2 - Modificar Imatge");
            System.out.println("3 - Llistar imatges");
            System.out.println("4 - Buscador d'imatges");
            System.out.println("5 - Exit");
            
            Scanner sc = new Scanner(System.in);
            int entrada = sc.nextInt();
            
            switch (entrada) {
                /*
                case 1:
                    Image result = new Image();
                    sc.nextLine();

                    System.out.println("Entra el títol");
                    result.settitle(sc.nextLine());

                    System.out.println("Entra la descripció");
                    result.setdescription(sc.nextLine());

                    System.out.println("Entra els tags (separats per ';')");
                    result.setkeywords(sc.nextLine());

                    System.out.println("Entra l'autor");
                    result.setauthor(sc.nextLine());

                    System.out.println("Entra la data de creació (format 2018-10-25)");
                    result.setcapture_date(sc.nextLine());

                    registerImage(result);

                    // Username
                    // Filename
                    // ID
                    break;
*/
                /*
                case 2:
                    System.out.println("Entra la ID de la imatge a modificar");
                    Image resultat = new Image();
                    resultat = searchById(sc.nextInt());
                    boolean acabat = false;
                    while (!acabat) {
                        System.out.println("-- Sel·lecciona el camp que vols modificar --");
                        System.out.println("1. Títol: " + resultat.gettitle());
                        System.out.println("2. Descripció: " + resultat.getdescription());
                        System.out.println("3. Autor: " + resultat.getauthor());
                        System.out.println("4. Data creació: " + resultat.getcapture_date());
                        System.out.println("5. Tags: " + resultat.getkeywords());
                        System.out.println("6. Sortir ");
                        System.out.println(" ");

                        int valor = sc.nextInt();
                        Scanner mod = new Scanner(System.in);
                        switch (valor) {
                            case 1:
                                System.out.println("Entra el nou títol");
                                resultat.settitle(mod.nextLine());
                                break;
                            case 2:
                                System.out.println("Entra la nova descripció:");
                                resultat.setdescription(mod.nextLine());
                                break;
                            case 3:
                                System.out.println("Entra el nou autor:");
                                resultat.setauthor(mod.nextLine());
                                break;
                            case 4:
                                System.out.println("Entra la nova data de creació (format 2018-10-26):");
                                resultat.setcapture_date(mod.nextLine());
                                break;
                            case 5:
                                System.out.println("Entra els nous tags separats per ';':");
                                resultat.setkeywords(mod.nextLine());
                                break;
                            case 6:
                                acabat = true;
                                modifyImage(resultat);
                                break;
                        }
                    }

                    break;
*/
                case 3:
                    List<Object> res = new ArrayList<Object>();
                    res = listImages();
                    Iterator<Object> it = res.iterator();

                    while (it.hasNext()) {
                        Object image = it.next();
                        Image mobj = Image.class.cast(image);
                        System.out.println("Id: " + mobj.getId());
                        System.out.println("Títol: " + mobj.getTitle());
                        System.out.println("Descripció: " + mobj.getDescription());
                        System.out.println("Autor: " + mobj.getAuthor());
                        System.out.println("Data creació: " + mobj.getCaptureDate());
                        System.out.println("Tags: " + mobj.getKeywords());
                        System.out.println(" ");
                    }
/*
                    System.out.println("1 - Modificar una imatge");
                    System.out.println("2 - Sortir");

                    Scanner entrance = new Scanner(System.in);
                    int value = entrance.nextInt();
                    if (value == 2) break;
                    else {
                    System.out.println("Introdueix el id de la imatge que vols modificar:");    
                    Scanner usmodif = new Scanner(System.in);
                    Image modif = new Image();
                    modif = searchById(usmodif.nextInt());
                    System.out.println("username: " + modif.getUsername());
                    if (modif.getUsername().equals(usrnm)){
                        boolean acabataux = false;
                        while (!acabataux) {
                        System.out.println("-- Sel·lecciona el camp que vols modificar --");
                        System.out.println("1. Títol: " + modif.gettitle());
                        System.out.println("2. Descripció: " + modif.getdescription());
                        System.out.println("3. Autor: " + modif.getauthor());
                        System.out.println("4. Data creació: " + modif.getcapture_date());
                        System.out.println("5. Tags: " + modif.getkeywords());
                        System.out.println("6. Sortir ");
                        System.out.println(" ");

                        int valor = sc.nextInt();
                        Scanner mod = new Scanner(System.in);
                        switch (valor) {
                            case 1:
                                System.out.println("Entra el nou títol");
                                modif.settitle(mod.nextLine());
                                break;
                            case 2:
                                System.out.println("Entra la nova descripció:");
                                modif.setdescription(mod.nextLine());
                                break;
                            case 3:
                                System.out.println("Entra el nou autor:");
                                modif.setauthor(mod.nextLine());
                                break;
                            case 4:
                                System.out.println("Entra la nova data de creació (format 2018-10-26):");
                                modif.setcapture_date(mod.nextLine());
                                break;
                            case 5:
                                System.out.println("Entra els nous tags separats per ';':");
                                modif.setkeywords(mod.nextLine());
                                break;
                            case 6:
                                acabataux = true;
                                modifyImage(modif);
                                break;
                        }
                    }

                    }
                    }
*/

                    break;
                    
                case 4:
                    System.out.println("1 - Buscar per Id");
                    System.out.println("2 - Buscar per Titol");
                    System.out.println("3 - Buscar per Autor");
                    System.out.println("4 - Buscar per Tag");
                    System.out.println("5 - Buscar per Data");

                    int entrada2 = sc.nextInt();
                    Scanner sc2 = new Scanner(System.in);
                    switch (entrada2) {
                        case 1:
                            System.out.println("Introdueix la ID");
                            int entradaaux1 = sc.nextInt();

                            Object image = searchById(entradaaux1);
                            Image mobj = Image.class.cast(image);
                            System.out.println("Títol: " + mobj.getTitle());
                            System.out.println("Descripció: " + mobj.getDescription());
                            System.out.println("Autor: " + mobj.getAuthor());
                            System.out.println("Data creació: " + mobj.getCaptureDate());
                            System.out.println("Tags: " + mobj.getKeywords());
                            System.out.println(" ");

                            break;
                            /*
                        case 2:
                            System.out.println("Introdueix el títol");
                            String entradaaux2 = sc2.nextLine();
                            List<Object> resultataux2 = new ArrayList<Object>();
                            resultataux2 = searchByTitle(entradaaux2);
                            Iterator<Object> itaux2 = resultataux2.iterator();

                            while (itaux2.hasNext()) {
                                Object imageaux2 = itaux2.next();
                                Image mobjaux2 = Image.class.cast(imageaux2);
                                System.out.println("Títol: " + mobjaux2.gettitle());
                                System.out.println("Descripció: " + mobjaux2.getdescription());
                                System.out.println("Autor: " + mobjaux2.getauthor());
                                System.out.println("Data creació: " + mobjaux2.getcapture_date());
                                System.out.println("Tags: " + mobjaux2.getkeywords());
                                System.out.println("Username: " + mobjaux2.getUsername());
                                System.out.println(" ");
                            }
                            break;
                        case 3:
                            System.out.println("Introdueix l'autor");
                            String entradaaux3 = sc2.nextLine();
                            List<Object> resultataux3 = new ArrayList<Object>();
                            resultataux3 = searchByAuthor(entradaaux3);
                            Iterator<Object> itaux3 = resultataux3.iterator();

                            while (itaux3.hasNext()) {
                                Object imageaux2 = itaux3.next();
                                Image mobjaux2 = Image.class.cast(imageaux2);
                                System.out.println("Títol: " + mobjaux2.gettitle());
                                System.out.println("Descripció: " + mobjaux2.getdescription());
                                System.out.println("Autor: " + mobjaux2.getauthor());
                                System.out.println("Data creació: " + mobjaux2.getcapture_date());
                                System.out.println("Tags: " + mobjaux2.getkeywords());
                                System.out.println("Username: " + mobjaux2.getUsername());
                                System.out.println(" ");

                            }
                            break;
                        case 4:
                            System.out.println("Introdueix el tag");
                            String entradaaux4 = sc2.nextLine();
                            List<Object> resultataux4 = new ArrayList<Object>();
                            resultataux4 = searchByKeywords(entradaaux4);
                            Iterator<Object> itaux4 = resultataux4.iterator();

                            while (itaux4.hasNext()) {
                                Object imageaux2 = itaux4.next();
                                Image mobjaux2 = Image.class.cast(imageaux2);
                                System.out.println("Títol: " + mobjaux2.gettitle());
                                System.out.println("Descripció: " + mobjaux2.getdescription());
                                System.out.println("Autor: " + mobjaux2.getauthor());
                                System.out.println("Data creació: " + mobjaux2.getcapture_date());
                                System.out.println("Tags: " + mobjaux2.getkeywords());
                                System.out.println("Username: " + mobjaux2.getUsername());
                                System.out.println(" ");
                            }
                            break;
                        case 5:
                            System.out.println("Introdueix la data de creació");
                            String entradaaux5 = sc2.nextLine();
                            List<Object> resultataux5 = new ArrayList<Object>();
                            resultataux5 = searchByCreaDate(entradaaux5);
                            Iterator<Object> itaux5 = resultataux5.iterator();

                            while (itaux5.hasNext()) {
                                Object imageaux2 = itaux5.next();
                                Image mobjaux2 = Image.class.cast(imageaux2);
                                System.out.println("Títol: " + mobjaux2.gettitle());
                                System.out.println("Descripció: " + mobjaux2.getdescription());
                                System.out.println("Autor: " + mobjaux2.getauthor());
                                System.out.println("Data creació: " + mobjaux2.getcapture_date());
                                System.out.println("Tags: " + mobjaux2.getkeywords());
                                System.out.println("Username: " + mobjaux2.getUsername());
                                System.out.println(" ");
                            }
                            break;
                        case 6:
                            sortir = true;
                            break;
*/
                    }
                    break;
                    
            }
        }
        
    }
    
    private static java.util.List<java.lang.Object> listImages() {
        
        
        try { // Call Web Service Operation
            org.me.servicioimagen.ServicioImagenWS_Service service = new org.me.servicioimagen.ServicioImagenWS_Service();
            org.me.servicioimagen.ServicioImagenWS port = service.getServicioImagenWSPort();
            // TODO process result here
            java.util.List<java.lang.Object> result = port.listImages();
            return result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
    private static Image searchById(int id) {
        Image result = new Image();
        try { 
            org.me.servicioimagen.ServicioImagenWS_Service service = new org.me.servicioimagen.ServicioImagenWS_Service();
            org.me.servicioimagen.ServicioImagenWS port = service.getServicioImagenWSPort();
            
           result = port.searchbyId(id);
            return result;
        } catch (Exception ex) {
        }
        return result;
    }
    
/*
    private static int modifyImage(Image image) {
        server.FotOkWS_Service service = new server.FotOkWS_Service();
        server.FotOkWS port = service.getFotOkWSPort();
        return port.modifyImage(image);
    }

    private static int registerImage(Image image) {
        server.FotOkWS_Service service = new server.FotOkWS_Service();
        server.FotOkWS port = service.getFotOkWSPort();
        return port.registerImage(image);
    }

    private static java.util.List<java.lang.Object> searchByAuthor(java.lang.String author) {
        server.FotOkWS_Service service = new server.FotOkWS_Service();
        server.FotOkWS port = service.getFotOkWSPort();
        return port.searchByAuthor(author);
    }

    private static java.util.List<java.lang.Object> searchByCreaDate(java.lang.String creaDate) {
        server.FotOkWS_Service service = new server.FotOkWS_Service();
        server.FotOkWS port = service.getFotOkWSPort();
        return port.searchByCreaDate(creaDate);
    }

    

    private static java.util.List<java.lang.Object> searchByKeywords(java.lang.String keywords) {
        server.FotOkWS_Service service = new server.FotOkWS_Service();
        server.FotOkWS port = service.getFotOkWSPort();
        return port.searchByKeywords(keywords);
    }

    private static java.util.List<java.lang.Object> searchByTitle(java.lang.String title) {
        server.FotOkWS_Service service = new server.FotOkWS_Service();
        server.FotOkWS port = service.getFotOkWSPort();
        return port.searchByTitle(title);
    }
*/
    }
    

