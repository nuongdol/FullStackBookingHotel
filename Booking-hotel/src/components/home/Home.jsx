import React from "react";
import MainHeader from "../layout/MainHeader";
import HotelService from "../common/HotelService";
import Parallax from "../common/Parallax";
import RoomCarousel from "../common/RoomCarousel";
import RoomSearch from "../common/RoomSearch";
import Footer from "../layout/Footer";

const Home = () => {
    return (
        <section>
            <MainHeader />
            <div className="container">
                <RoomSearch/>
                <RoomCarousel/>
                <Parallax />
                <RoomCarousel/>
                <HotelService />
                <hr/>
                <Parallax />
            </div>

        </section>
    )
}
export default Home;