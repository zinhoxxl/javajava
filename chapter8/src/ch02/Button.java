package ch02;

public class Button {

	// 필드 - 사용
	OnclickListener listener;
	
	
	public void setOnClickListener(OnclickListener listener) {
		this.listener = listener;
	}


    // 
	void touch() {
		listener.onClick();
	}
	
	
	
	// 내부 인터페이스
	interface OnclickListener {
		void onClick();
	}
}
