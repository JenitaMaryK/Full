//<code class="language-css">
class JBT {
	int variable = 5;

	public static void main(String args[]) {
		JBT obj = new JBT();
		obj.method();
		obj.method(20);
		
	}

	void method(int variable) {
		this.variable = variable;
		tSystem.out.println("Value of Instance variable :" + this.variable);
		System.out.println("Value of Local variable :" + variable);
	}

	void method() {
		int variable = 40;
		System.out.println("Value of Instance variable :" + this.variable);
		System.out.println("Value of Local variable :" + variable);
	}
}
// </code>
