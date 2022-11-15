package modelo.entidades;

import modelo.excecoes.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private Integer numeroDoQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(Integer numeroDoQuarto, Date checkIn, Date checkOut) {
        //verificando se o check-out é posterior ao check-in
        if (!checkOut.after(checkIn)) {
            //mensagem de erro que irá ser disparada caso algo der errado
            throw new DomainException("A data de check-out deve ser após a data de check-in");
        }
        this.numeroDoQuarto = numeroDoQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(Integer numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        //convertendo a data em milisegundos
        long diferenca = checkOut.getTime() - checkIn.getTime();
        //convertendo milisegundos para dias e retornando a diferença
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

    public void atualizarDatas(Date checkIn, Date checkOut) {
        //pega a data atual do sistema
        Date now = new Date();

        //verificando se as datas são futuras para a atualização
        if (checkIn.before(now) || checkOut.before(now)) {
            //mensagem de erro que irá ser disparada caso algo der errado
            throw new DomainException("As datas de reserva para atualização devem ser datas futuras");
        }

        //verificando se o check-out é posterior ao check-in
        if (!checkOut.after(checkIn)) {
            //mensagem de erro que irá ser disparada caso algo der errado
            throw new DomainException("A data de check-out deve ser após a data de check-in");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "numeroDoQuarto: " + numeroDoQuarto +
                ", check-in: " + sdf.format(checkIn) +
                ", check-out: " + sdf.format(checkOut) +
                ", " + duration() + " Noites";
    }
}
