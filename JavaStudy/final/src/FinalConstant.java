import java.util.Objects;

public class FinalConstant {
	
	public final String validateInput(String paramInput) {
		String message = null;
		if (Objects.isNull(paramInput)) {
			message = "nullです";
		} else if (paramInput.isBlank()) {
			message = "ブランクです";
		} else if (paramInput.isEmpty()) {
			message = "空文字です";
		} else {
			message = "入力値あります";
		}
		return message;
	}
	String  message = validateInput("入力値");
}
