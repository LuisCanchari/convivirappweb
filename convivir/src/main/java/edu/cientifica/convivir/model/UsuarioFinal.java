package edu.cientifica.convivir.model;

public class UsuarioFinal extends Usuario{
	private UInmobiliaria uinmobiliaria;

	public UInmobiliaria getUinmobiliaria() {
		return uinmobiliaria;
	}

	public void setUinmobiliaria(UInmobiliaria uinmobiliaria) {
		this.uinmobiliaria = uinmobiliaria;
	}

	@Override
	public String toString() {
		return super.toString()+" UsuarioFinal [uinmobiliaria=" + uinmobiliaria.toString() + "]";
	}
}
