package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField EmailField;
	@FXML
	private PasswordField SenhaField;
	
	public void entrar() {
		boolean emailvalido = EmailField.getText().equals(" ");
		boolean senhaValida = SenhaField.getText().equals("3030");
	
		if(emailvalido && senhaValida) {
			Notifications.create()
			.position(Pos.TOP_CENTER)
				.title("Login FXML")
				.text("Login efetuado com sucesso!")
				.showInformation();
		} else  {
			Notifications.create()
			.position(Pos.TOP_CENTER)
			.title("Login FXML")
			.text("Usuário e/ou senha Inválido!")
			.showError();
		}
	
	}

}
