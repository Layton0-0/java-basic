package quiz.quiz01.movie;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview mr1 = new MovieReview("인셉션", "인생은 무한 루프");
        MovieReview mr2 = new MovieReview("어바웃 타임", "인생 시간 영화!");
        MovieReview[] mr = {mr1, mr2};

        for(int i = 0; i < mr.length; i++) {
            System.out.println("영화 제목: " + mr[i].title + ", 리뷰: " + mr[i].review);
        }
    }
}
