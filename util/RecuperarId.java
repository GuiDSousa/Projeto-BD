package util;

public class RecuperarId {
    /**
     * Retorna o id corresponde a um Genero de acordo com o seu nome. Retorna -1
     * se o genero nao existir.
     */
    public static int getIdGenero(String nomeGenero) {
        int id = -1;
        switch (nomeGenero) {
            case "Ação": {
                id = 1;
                break;
            }
            case "Aventura": {
                id = 2;
                break;
            }
            case "Corrida": {
                id = 3;
                break;
            }
            case "Estratégia": {
                id = 4;
                break;
            }
            case "Esporte": {
                id = 5;
                break;
            }
            case "Fantasia": {
                id = 6;
                break;
            }
            case "RPG": {
                id = 7;
                break;
            }
            case "Shooter": {
                id = 8;
                break;
            }
            case "Simulação": {
                id = 9;
                break;
            }
            case "Terror": {
                id = 10;
                break;
            }
            case "Luta": {
                id = 11;
                break;
            }
        }// fim switch-case
        return id;
    }// fim do metodo getIdGenero

    public static String getGeneroString(int id) {
        String genero = null;

        switch (id) {
            case 1: {
                genero = "Ação";
                break;
            }
            case 2: {
                genero = "Aventura";
                break;
            }
            case 3: {
                genero = "Corrida";
                break;
            }

            case 4: {
                genero = "Estratégia";
                break;
            }
            case 5: {
                genero = "Esporte";
                break;
            }
            case 6: {
                genero = "Fantasia";
                break;
            }
            case 7: {
                genero = "RPG";
                break;
            }

            case 8: {
                genero = "Shooter";
                break;
            }
            case 9: {
                genero = "Simulação";
                break;
            }

            case 10: {
                genero = "Terror";
                break;
            }
            case 11: {
                genero = "Luta";
                break;
            }

        }// switch
        return genero;
    }

    public static String getPlataformaString(int id) {
        String plataforma = null;

        switch (id) {
            case 1: {
                plataforma = "GameBoy";
                break;
            }
            case 2: {
                plataforma = "GameCube";
                break;
            }
            case 3: {
                plataforma = "MasterSystem";
                break;
            }

            case 4: {
                plataforma = "Nintendo 64";
                break;
            }
            case 5: {
                plataforma = "PC";
                break;
            }
            case 6: {
                plataforma = "PlayStation 1";
                break;
            }
            case 7: {
                plataforma = "PlayStation 2";
                break;
            }

            case 8: {
                plataforma = "PolyStation";
                break;
            }
            case 9: {
                plataforma = "Super Nintendo";
                break;
            }

            case 10: {
                plataforma = "Xbox";
                break;
            }

        }// switch
        return plataforma;
    }

    /**
     * Retorna o id corresponde a uma Plataforma de acordo com o seu nome. Retorna
     * -1
     * se a plataforma nao existir.
     */
    public static int getIdPlataforma(String nomePlataforma) {
        int id = -1;

        switch (nomePlataforma) {
            case "GameBoy": {
                id = 1;
                break;
            }
            case "GameCube": {
                id = 2;
                break;
            }
            case "MasterSystem": {
                id = 3;
                break;
            }
            case "Nintendo 64": {
                id = 4;
                break;
            }
            case "PC": {
                id = 5;
                break;
            }
            case "PlayStation 1": {
                id = 6;
                break;
            }
            case "PlayStation 2": {
                id = 7;
                break;
            }
            case "PolyStation": {
                id = 8;
                break;
            }
            case "Super Nintendo": {
                id = 9;
                break;
            }
            case "Xbox": {
                id = 10;
                break;
            }
        }// fim do switch
        return id;
    }// fim do metodo getIdPlataforma

}// fim da classe RecuperarId