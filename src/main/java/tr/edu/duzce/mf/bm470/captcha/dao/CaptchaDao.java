package tr.edu.duzce.mf.bm470.captcha.dao;

import tr.edu.duzce.mf.bm470.captcha.model.Captcha;

import java.util.List;

public interface CaptchaDao {

    void saveCaptcha(Captcha captcha);

    List<Captcha> findAll();
}