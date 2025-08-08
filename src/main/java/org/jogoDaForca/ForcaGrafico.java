package org.jogoDaForca;


public class ForcaGrafico {
    public static void mostrar(int erros) {
        String[] forca = {
                """
              _______
             |/      
             |      
             |      
             |      
             |     
            _|___
            """,
                """
              _______
             |/      |
             |      ( )
             |        
             |      
             |     
            _|___
            """,
                """
              _______
             |/      |
             |      ( )
             |       |
             |       
             |     
            _|___
            """,
                """
              _______
             |/      |
             |      ( )
             |      /|
             |       
             |     
            _|___
            """,
                """
              _______
             |/      |
             |      ( )
             |      /|\\
             |       
             |     
            _|___
            """,
                """
              _______
             |/      |
             |      ( )
             |      /|\\
             |      / 
             |     
            _|___
            """,
                """
              _______
             |/      |
             |      ( )
             |      /|\\
             |      / \\
             |     
            _|___
            """
        };

        System.out.println(forca[erros]);
        System.out.println("Erros: " + erros);
    }
}
