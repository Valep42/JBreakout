package gui;

import graphics.Image;

public class Text extends GUIElement {
	private float scale;
	private String text;

	private Image[] letters;

	/**
	 * @param folder
	 *            the folder where all the pictures of the letters are as bmps.
	 */
	public Text(String folder, String text, float x, float y, float height) {
		super(x, y);
		int characterHeight = 5;
		this.scale = height /characterHeight;
		Alphabet alphabet = new Alphabet();
		this.text = text;
		this.letters = new Image[26];
		for (int i = 0; i < 26; ++i) {
			letters[i] = new Image(folder +"/"+ alphabet.getLetter(i) + ".bmp", this.scale);

		}
	}

	@Override
	public void render() {
		char[] text = new char[this.text.length()];
		text = this.text.toCharArray();
		
		for (int i = 0; i < text.length; ++i) {
			char c = text[i];
			this.letters[c - (int) 'A'].render(this.coordinates.getX() + i * 6 * this.scale, this.coordinates.getY());
		}

	}

}
