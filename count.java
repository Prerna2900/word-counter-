class count {
	public static void main(String args[]) {
		String text = "This is a text used for word counting";
		String words[] = text.split("\\s");
		int length = words.length;
		System.out.println("Number of words are: " + length);
	}
}