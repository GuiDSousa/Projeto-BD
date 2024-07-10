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

    /**
     * Retorna o id corresponde a uma Plataforma de acordo com o seu nome. Retorna -1
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