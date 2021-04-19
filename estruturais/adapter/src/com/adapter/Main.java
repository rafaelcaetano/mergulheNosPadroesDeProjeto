package com.adapter;

import com.adapter.round.RoundPeg;
import com.adapter.round.RoundRole;
import com.adapter.square.SquarePeg;
import com.adapter.square.SquarePegdapter;

public class Main {

    public static void main(String[] args) {

        RoundRole hole = new RoundRole(5);
        RoundPeg rPeg = new RoundPeg(5);

        System.out.println("Round peg isFits: " + hole.fits(rPeg));

        SquarePeg smallPeg = new SquarePeg(5);
        SquarePeg largePeg = new SquarePeg(10);

        // Exemplo de chamada direta a classe do servico desejado quq nao compila
        //hole.fits(smallPeg);

        SquarePegdapter smallPegAdapter = new SquarePegdapter(smallPeg);
        SquarePegdapter largePegAdapter = new SquarePegdapter(largePeg);

        System.out.println("Small square adapted isFit: " + hole.fits(smallPegAdapter));
        System.out.println("Large square adapted isFit: " + hole.fits(largePegAdapter));
    }

}
