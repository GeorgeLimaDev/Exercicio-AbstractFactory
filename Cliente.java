import interfaces.GUIGeneratorFactory;
import interfaces.MacOSGUIFactory;
import interfaces.WindowsGUIFactory;
import interfaces.iButton;
import interfaces.iSelectionBox;
import interfaces.iTextArea;

public class Cliente {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        System.out.println("Sistema operacional detectado: " + os);

        if (os.contains("Windows")) {
            GUIGeneratorFactory gui = new WindowsGUIFactory();
            iButton botao = gui.generateButton("Clique aqui");
            System.out.println(botao.toString());
            iSelectionBox caixaDeSelecao = gui.generateSelectionBox("Valores para seleção");
            System.out.println(caixaDeSelecao.toString());
            iTextArea areaDeTexto = gui.generateTextArea("O texto vai aqui");
            System.out.println(areaDeTexto.toString());

        } else {
            GUIGeneratorFactory gui = new MacOSGUIFactory();
            iButton botao = gui.generateButton("Clique aqui");
            System.out.println(botao.toString());
            iSelectionBox caixaDeSelecao = gui.generateSelectionBox("Valores para seleção");
            System.out.println(caixaDeSelecao.toString());
            iTextArea areaDeTexto = gui.generateTextArea("O texto vai aqui");
            System.out.println(areaDeTexto.toString());
        }
    }

}
