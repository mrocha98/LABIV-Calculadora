package br.gov.sp.fatec.calculadoramaven;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Calculator {
    private float n1;
    private float n2;

    public Calculator() {
        this.setN1(1f);
        this.setN2(1f);
    }

    public float sum() {
        return this.getN1() + this.getN2();
    }

    public float subtract() {
        return this.getN1() - this.getN2();
    }

    public float multiply() {
        return this.getN1() * this.getN2();
    }

    public float divide() {
        if (this.getN2() == 0) throw new ArithmeticException();
        return this.getN1() / this.getN2();
    }
}
